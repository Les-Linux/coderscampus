/*
    a class which returns default console  output
    strings, based on input parameter value
*
 */
package com.coderscampus.week2;

public class OutputPrompt {
    static String output;
    public static String getPrompt(int prompt,String name){
        if(prompt == 1) {
            output =   "######################################\n" +
                            "   Please Authenticate\n" +
                            "######################################";
        }else if(prompt == 2) {
            output = "Enter your EMail:";
        }else if(prompt == 3){
            output = "Enter your Password";
        }else if(prompt == 4){
            output = "Welcome " + name;
        }else if(prompt == 5){
            output = "Invalid login, please try again.";
        }
        return output;
    }//end getProperty
}//end class
