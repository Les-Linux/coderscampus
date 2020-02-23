/*
    a class which returns a random generated number between 1 and 100
*/

package com.coderscampus.week1;

import java.util.Random;

public class RandomNumber {
    Random random;
    int randomNum = 0;

    public RandomNumber() {
        random = new Random();
    }

    public int getRandomNumber(){

        while(randomNum == 0) {
            randomNum = random.nextInt(101);
        }
        return randomNum;
    }
}
