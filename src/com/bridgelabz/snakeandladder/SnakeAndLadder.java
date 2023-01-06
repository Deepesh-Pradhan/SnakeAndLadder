package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        System.out.println("   WELCOME TO SNAKE AND LADDER SIMULATOR");
        System.out.println("Welcome Player 1");
        int p1 = 0;
        Random random = new Random();
        int roll = random.nextInt(5);
        int out = roll + 1;
        int play = random.nextInt(3);
        int move = 0;
        if (play == 1) {
            move = move - out;
            p1 = move;
            System.out.println("Player 1 rolled => " + out);
            System.out.println("player 1 found a Snake and moved behind");
            System.out.println("PLayer 1 is at position => " + p1);
        } else if (play == 2) {
            move = move + out;
            p1 = move;
            System.out.println("Player 1 rolled => " + out);
            System.out.println("Player 1 moved ahead using Ladder");
            System.out.println("PLayer 1 is at position => " + p1);
        } else {
            System.out.println("Player 1 rolled => " + out);
            System.out.println("Player 1 cant move forward");
            System.out.println("PLayer 1 is at position => " + p1);
        }
    }
}
