package com.java.cards;

public class Game {
    public static void main(String[] args) {
        DeckOfCards deckcard = new DeckOfCards();
        Player play = new Player();
        System.out.println("Welcome to deck of cards program!!");
        deckcard.initGame();
        play.addPlayer();
        deckcard.distributeCard();
    }
}
