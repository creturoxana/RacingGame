package org.example.controller.utils;

import java.util.Scanner;

public class ScannerUtils {

  public static final Scanner SCANNER = new Scanner(System.in);

  public static int readNextSingleInt() {
    int integer = SCANNER.nextInt();
    SCANNER.nextLine();
    return integer;
  }

  public static double readNextSingleDouble() {
    try {
      return SCANNER.nextDouble();
    } finally {
      SCANNER.nextLine();
    }
  }

}
