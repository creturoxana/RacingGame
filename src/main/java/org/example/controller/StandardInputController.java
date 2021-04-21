package org.example.controller;

import java.util.Scanner;

public class StandardInputController {

  public int getPlayerCountFromUser() {
    System.out.println("Enter number of players: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }



}
