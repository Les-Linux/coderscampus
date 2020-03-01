package com.coderscampus.week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username,password,alias;

        try{
            System.out.println(OutputPrompt.getPrompt(1,""));
            System.out.println(OutputPrompt.getPrompt(2,""));
            username = scanner.nextLine();
            System.out.println(OutputPrompt.getPrompt(3,""));
            password = scanner.nextLine();


            while(!ValidateCredentials.isValidUser(username,password)){
                System.out.println(OutputPrompt.getPrompt(5,""));
                System.out.println(OutputPrompt.getPrompt(2,""));
                username = scanner.nextLine();
                System.out.println(OutputPrompt.getPrompt(3,""));
                password = scanner.nextLine();
                continue;
            }
            System.out.println(OutputPrompt.getPrompt(4,ValidateCredentials.getAlias()));
        }catch(Exception e){
            System.out.println("Main Exception Caught! Error:" + e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
