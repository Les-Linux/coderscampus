/*
    a class which returns default console  output
    strings, based on input parameter value
*
 */
package com.coderscampus.week1;

public class OutputPrompt {
    String prompt;
    public String getPrompt(int prompt){
        if(prompt == 1) {
            this.prompt =   "######################################\n" +
                            "   Pick a number between 1 and 100!\n" +
                            "######################################";
        }else if(prompt == 2) {
            this.prompt = "Please pick a lower number";
        }else if(prompt == 3){
            this.prompt = "Please pick a higher number";
        }else if(prompt == 4){
            this.prompt = "You Win!";
        }else if(prompt == 5){
            this.prompt = "You lose, the number to guess was ";
        }
        else if(prompt == 6){
            this.prompt = "Your guess is not between 1 and 100, please try again.";
        }
        return this.prompt;
    }//end getProperty
}//end class
