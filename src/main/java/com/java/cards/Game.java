package com.java.cards;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards program!!");
        DeckOfCards deckcard = new DeckOfCards();
        Player play = new Player();
        deckcard.initGame();
        play.addPlayer();
        play.playerSequence();
    }
}
