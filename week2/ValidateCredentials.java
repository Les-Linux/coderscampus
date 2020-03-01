package com.coderscampus.week2;

public class ValidateCredentials {
    static boolean isValid;
    static String alias;
    static User[] users = userService.getUserDetails();
    public static boolean isValidUser(String username, String password) {
        for(User user : users){
            if((username.toLowerCase().equals(user.username.toLowerCase()) && (password.equals(user.password)))) {
                isValid = true;
                setAlias(user.name);
                break;
            }else{
                isValid = false;
            }
        }
        return isValid;
    }
    public static String getAlias(){
        return alias;
    }
    public static void setAlias(String name){
        alias = name;
    }
}
