package com.java.cards;

public class DeckOfCards {
    public static String[] suit = {"Clubs", "Diamond", "Spades", "Hearts"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[][] deck = new String[suit.length][rank.length];

    public void initGame() {
        int cardCount = 0;
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

}
