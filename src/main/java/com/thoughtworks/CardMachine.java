package com.thoughtworks;

import java.util.ArrayList;
import java.util.Random;

public class CardMachine {
    private ArrayList<Card> cards= new ArrayList<>();

    public CardMachine() {
        this.initCards();
    }

    /**
     * 初始化牌组
     */
    public void initCards() {
        for (String flower: new String[]{"黑桃", "红桃", "梅花", "方块"}){
            for (String suit: new String[]{"A", "J", "Q", "K"}){
                cards.add(new Card(flower, suit));
            }
            for (int i = 2; i <= 10; i++){
                cards.add(new Card(flower, ""+i));
            }
        }
    }

    /**
     * 随机抽取对应数张牌，并打印出来
     * @param handCardNumber 需要抽取牌的张数
     */
    public void drawCard(int handCardNumber) {
        Random random = new Random();
        for (int i = 0; i < handCardNumber; i++){
            System.out.print(this.shuffleACard(random.nextInt(cards.size())) + " ");
        }

    }

    /**
     * 根据drawCard中生成的随机数抽取对应位置的牌
     * @param index 一个随机数
     * @return Card类对象
     */
    public Card shuffleACard(int index) {
        return cards.remove(index);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}