package com.thoughtworks;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    handCardMachine();
  }
  
  public static void handCardMachine() {
    System.out.println("请输入需要抽取牌的张数 ： ");
    int handCardNumber = new Scanner(System.in).nextInt();
    if (isInRange(handCardNumber)){
      CardMachine cardMachine = new CardMachine();
      cardMachine.drawCard(handCardNumber);
    } else {
      System.out.println("输入的数超过范围 ！ ");
    }
  }

  public static boolean isInRange(int n) {
    return (n >= 1 && n <=52);
  }
}
