package com.java.cards;

import java.util.Scanner;

public class DeckOfCards {
    public void initGame() {
        int cardCount = 0;
        String[] suit = {"Clubs", "Diamond", "Spades", "Hearts"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] deck = new String[suit.length][rank.length];

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i][j] = suit[i] + " " + rank[j];
                System.out.println(deck[i][j]);
                cardCount++;
            }
            System.out.println(" ");
        }
        System.out.println("Total number of cards are:" + cardCount);
    }

    public static void addPlayer() {
        System.out.println("Enter number of players:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 2 && num <= 4) {
            System.out.println("Welcome to game!");
        } else {
            System.out.println("Please enter 2,3 or 4 number of players:");
        }
    }
}
