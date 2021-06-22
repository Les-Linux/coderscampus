package com.coderscampus.week2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class userService {
    static User[] users = new User[4];
    static String userDetails;
    static BufferedReader fileReader;
    static int i = 0;
    public static User[] getUserDetails() {
        try{
            fileReader = new BufferedReader(new FileReader("data.txt"));

            while((userDetails = fileReader.readLine()) != null){
                String[] userLine = userDetails.split(",");
                User user = new User();
                user.username = userLine[0];
                user.password = userLine[1];
                user.name = userLine[2];
               if(i == 0){ //check if counter has already been incremented
                    users[i] = user;
                    i++;
                }else{
                    users[i] = user; //add user to next free array dimension
                    i++;
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("FNF Exception Caught! Error:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO1 Exception Caught! Error:" + e.getMessage());
        } finally{
            try{
                fileReader.close();
            }catch(IOException e){
                System.out.println("IO2 Exception Caught! Error:" + e.getMessage());
            }
        }
        return users;
    }




}
