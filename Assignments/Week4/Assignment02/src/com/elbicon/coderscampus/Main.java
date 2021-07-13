package com.elbicon.coderscampus;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variable Declaration
        Scanner scanner = new Scanner(System.in);
        RandomNumber randomNumber = new RandomNumber();
        ValidateGuess validateGuess = new ValidateGuess();
        int randomNumberValue = randomNumber.getRandomNumber();
        int numberOfGuesses = 5;
        int maxNumber = 100;
        String guessMessage;

        System.out.println("Hint: " + randomNumberValue);
        System.out.println("Pick a Number between 1 and 100");



       // guessMessage = validateGuess.Validate(scanner.nextInt(),randomNumberValue,maxNumber);

        //System.out.println(guessMessage);

        int i = 0;
        while (i != numberOfGuesses){
            guessMessage = validateGuess.Validate(scanner.nextInt(),randomNumberValue,maxNumber);
            if(guessMessage.substring(0,4).equals("Your")) {
                System.out.println(guessMessage);
            }else if(guessMessage.contains("win")){
                System.out.println(guessMessage);
                System.exit(0);
            }
            else {
                i++;
                if(i != 5){
                    System.out.println(guessMessage);
                }
            }
        }
    }
}