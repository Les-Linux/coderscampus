package com.elbicon.coderscampus;

import java.util.Random;

public class RandomNumber {
    Random randomNumber = new Random();

    public int getRandomNumber(){
        return randomNumber.nextInt(101);
    }
}
