package com.thoughtworks;

public class Card {
    private String flower;
    private String suit;

    public Card(String flower, String suit) {
        this.flower = flower;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return (this.flower + this.suit);
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
