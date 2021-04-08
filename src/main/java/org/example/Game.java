package org.example;

import java.util.Scanner;

public class Game {

  public void start () {

    System.out.println( "Welcome to the Racing Game!" );
    System.out.println("\uD83D\uDE97");

    int playerCount = getPlayerCountFromUser();
  }

  private int getPlayerCountFromUser() {
    System.out.println("Enter number of players: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}
