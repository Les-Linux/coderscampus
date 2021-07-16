package com.elbicon.coderscampus;

public class ValidateGuess {
    int guess;
    int randomNumber;

    public String Validate(int guess, int randomNumber, int minNumber, int maxNumber){
        this.guess = guess;
        this.randomNumber = randomNumber;

        if(guess > maxNumber || guess < minNumber){
            return "Your guess is not between 1 and 100, please try again";
        }
        else if(guess < randomNumber){
            return "Please pick a higher number";
        } else if(guess > randomNumber){
            return "Please pick a lower number";
        }
        else{
            return "You win!";
        }
    }

}
