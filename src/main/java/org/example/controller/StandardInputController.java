package org.example.controller;

import java.util.InputMismatchException;
import org.example.controller.utils.ScannerUtils;

public class StandardInputController {

  public int getPlayerCountFromUser() {
    System.out.println("Enter number of players: ");
    return ScannerUtils.readNextSingleInt();
  }

  public int getTrackNumberFromUser() {
    System.out.println("Enter number of track: ");
    return ScannerUtils.readNextSingleInt();

  }

  public int getCompetitorTypeFromUser() {
    System.out.println("Enter number of track: ");
    try {
      return ScannerUtils.readNextSingleInt();
    } catch (InputMismatchException e) {
      System.out.println("Wrong value. Try again...");
      return getCompetitorTypeFromUser();
    }
  }

  public String getVehicleMakeFromUser() {
    System.out.println("Please enter vehicle make:");
    return ScannerUtils.SCANNER.nextLine();

  }

  public double getAccelerationSpeedFromUser() {
    System.out.println("Please enter acceleration speed:");
    try {
      return ScannerUtils.readNextSingleDouble();
    } catch (InputMismatchException e) {
      System.out.println("You have entered an invalid value. Please try again.");

      //recursion
      return getAccelerationSpeedFromUser();
    }
  }

}
