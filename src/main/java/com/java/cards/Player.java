package com.java.cards;

import java.util.Scanner;

public class Player {
    int playersCount;
    public void addPlayer() {
        System.out.println("Enter number of players:");
        Scanner sc = new Scanner(System.in);
        playersCount = sc.nextInt();

        if (playersCount >= 2 && playersCount <= 4) {
            for (int i = 1; i <= playersCount; i++) {
                System.out.println("Player number : " + i);

            }
        } else {
            System.out.println("Please enter 2,3 or 4 number of players");
            addPlayer();
        }
    }

    public void playerSequence() {
        for (int i = 1; i <= playersCount; i++) {
            System.out.println("Player" + i);
        }

    }
}
