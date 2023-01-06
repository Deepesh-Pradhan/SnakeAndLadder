package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        System.out.println("   WELCOME TO SNAKE AND LADDER SIMULATOR");
        System.out.println("Welcome Player 1");
        int p1 = 0;
        while (p1 <= 100) {
            if (p1 < 0) {
                p1 = 0;
                continue;
            }
            Random random = new Random();
            int roll = random.nextInt(6);
            int out = roll + 1;
            System.out.println(roll + "  " + out);
            int play = random.nextInt(3);
            if (play == 1) {
                p1 = p1 - out;
                System.out.println("Player 1 rolled => " + out);
                System.out.println("player 1 found a Snake and moved behind");
            } else if (play == 2) {
                p1 = p1 + out;
                System.out.println("Player 1 rolled => " + out);
                System.out.println("Player 1 moved ahead using Ladder");
            } else {
                System.out.println("Player 1 rolled => " + out);
                System.out.println("Player 1 cant move forward");
            }
            System.out.println("PLayer 1 is at position => " + p1);
            System.out.println("   ");
        }
        System.out.println("Player 1 has completed the Game");
    }
}
