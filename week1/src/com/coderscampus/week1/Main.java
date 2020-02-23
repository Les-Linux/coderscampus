package com.coderscampus.week1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// variable declaration / instantiation
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        int randomValue = game.getRandomNumber();

     //prompt user to select number between 1 - 100
        System.out.println("Random Number: " + randomValue);
        System.out.println(game.getUserPrompt(1));
        int minValue = 1;
        int maxValue = 100;

     //control structure
        for(int i=1;i<=game.getMaxGame();i++) {
            try {
                int userValue = scanner.nextInt();
                //verify that input is between 1 and 100
                if(userValue < game.getMinValue() || userValue > maxValue) {
                    ConsoleOutput(game.getUserPrompt(6));
                    i--;
                    scanner.nextLine();
                    continue; //return to start of control structure
                }

                if (userValue < randomValue && i != game.getMaxGame()) {
                    ConsoleOutput(game.getUserPrompt(3)); //higher number
                } else if (userValue > randomValue && i != game.getMaxGame()) {
                    ConsoleOutput(game.getUserPrompt(2)); //lower number
                } else if (userValue == randomValue) {
                    ConsoleOutput(game.getUserPrompt(4)); //Win Message
                    break;
                } else {
                    ConsoleOutput(game.getUserPrompt(5) + randomValue); //Lose Message
                }
            }catch(Exception e){
                //System.out.println(game.getUserPrompt(6)); //throw error
                ConsoleOutput(game.getUserPrompt(6)); //Invalid Input
                i--; //reducing the initializer ensures the user is not penalizes for entering a non numeric value
                scanner.nextLine(); //advance scanner past current erroneous line and return to control structure
            }
        }//end control structure
    }//end main
    public static void ConsoleOutput(String output){
        System.out.println(output);
    }
}//end class