package com.java.cards;

        import java.util.Scanner;
        import java.util.ArrayList;

public class DeckOfCards {
    public static String[] suit = {"Clubs", "Diamond", "Spades", "Hearts"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public ArrayList<String> cardsDeck = new ArrayList<String>();
    public static int cardsArr = 9;
    public static int playerList = 9;
    public static String[][] deck = new String[suit.length][rank.length];
    //   String[][] cards = DeckOfCards.deckOf(suit, rank, deck);
//    ArrayList<Player> playerList = new  ArrayList<>();
//    ArrayList<String> cardsArr = new  ArrayList<>();

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

    public void distributeCard() {
        for (int i = 0; i < cardsArr; i++) {
            for (int j = 0; j < playerList; j++) {
                ArrayList<String> temp = new ArrayList<String>();
                while (!cardsDeck.isEmpty()) {
                    int loc = (int) (Math.random() * cardsDeck.size());
                    temp.add(cardsDeck.get(loc));
                    cardsDeck.remove(loc);
                }
                cardsDeck = temp;

            }
        }


    }
}