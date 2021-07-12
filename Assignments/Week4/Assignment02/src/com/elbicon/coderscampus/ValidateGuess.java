package com.elbicon.coderscampus;

public class ValidateGuess {
    private int guess;
    private int randomNumber;

    public String Validate(int guess, int randomNumber, int maxNumber){
        this.guess = guess;
        this.randomNumber = randomNumber;

        if(guess > maxNumber){
            return "Your guess is not between 1 and 100, please try again";
        }
        else if(guess < randomNumber){
            return "Please pick a higher number";
        }
        else if(guess > randomNumber){
            return "Please pick a lower number";
        }
        else{
            return "You win!";
        }
    }

}
