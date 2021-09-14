package com.java.cards;

import java.util.Scanner;

public class Player {
    public void addPlayer() {
        System.out.println("Enter number of players:");
        Scanner sc = new Scanner(System.in);
        int playersCount = sc.nextInt();
        if (playersCount >= 2 && playersCount <= 4) {
            for (int i = 1; i <= playersCount; i++) {
                System.out.println("Player number : " + i);

            }
            playerSequence(playersCount);
        } else {
            System.out.println("Please enter 2,3 or 4 number of players");
        }
    }

    public void playerSequence(int playersCount) {
        for (int i = 1; i <= playersCount; i++) {
            System.out.println("Player" + i);
        }

    }
}
