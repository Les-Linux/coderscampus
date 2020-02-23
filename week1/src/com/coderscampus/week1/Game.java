/*
    a class which returns default game values and
    console output
 */

package com.coderscampus.week1;

import java.util.Scanner;

public class Game {

    RandomNumber randomNumber = new RandomNumber();
    OutputPrompt outputPrompt = new OutputPrompt();

    public int getRandomNumber(){
        return this.randomNumber.getRandomNumber();
    }
    public String getUserPrompt(int prompt){
        return this.outputPrompt.getPrompt(prompt);
    }

    public int getMinValue(){
        return 1;
    }
    public int getMaxValue(){
        return 100;
    }

   public int getMaxGame(){
        return 5;
   }
}
