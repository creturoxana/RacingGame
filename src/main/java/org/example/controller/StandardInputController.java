package org.example.controller;

import java.util.Scanner;

public class StandardInputController {

  public int getPlayerCountFromUser() {
    System.out.println("Enter number of players: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  public int getTrackNumberFromUser() {
    System.out.println("Enter number of track: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

}
