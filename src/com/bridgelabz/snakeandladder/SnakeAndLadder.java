package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

    static int P1 = 0;

    public static void main(String[] args) {

        System.out.println("   WELCOME TO SNAKE AND LADDER SIMULATOR");
        System.out.println("Welcome Player 1");
        Random random = new Random();
        int roll = random.nextInt(6);
        int out = roll + 1;
        System.out.println("Player 1 rolled => "+out);
        System.out.println("PLayer 1 is at position => " + P1 + out);
    }
}
