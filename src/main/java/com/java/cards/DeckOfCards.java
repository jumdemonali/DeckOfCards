package com.java.cards;

import java.util.ArrayList;

public class DeckOfCards {
    public static String[] suit = {"Clubs", "Diamond", "Spades", "Hearts"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[][] deck = new String[suit.length][rank.length];
    ArrayList<String> cardsDeck = new ArrayList<>();

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

    public void toshuffle() {
        ArrayList<String> temp = new ArrayList<String>();
        while (!cardsDeck.isEmpty()) {
            int loc = (int) (Math.random() * cardsDeck.size());
            temp.add(cardsDeck.get(loc));
            cardsDeck.remove(loc);
        }
        cardsDeck = temp;
        print(cardsDeck);
    }

    public static void print(ArrayList<String> cardsDeck) {
        for (String card : cardsDeck) {
            System.out.print("Cards are" + card);
        }
    }
}
