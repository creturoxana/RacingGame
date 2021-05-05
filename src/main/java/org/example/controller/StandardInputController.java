package org.example.controller;

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

  public String getVehicleMakeFromUser() {
    System.out.println("Please enter vehicle make:");
    return ScannerUtils.SCANNER.nextLine();

  }

  public double getAccelerationSpeedFromUser() {
    System.out.println("Please enter acceleration speed:");
    return ScannerUtils.readNextSingleDouble();
  }

}
