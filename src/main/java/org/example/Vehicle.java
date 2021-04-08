package org.example;

public class Vehicle {

  //instance variables
  String make;
  String model;
  String color;
  double mileage;
  double fuelLevel;
  double maxSpeed;
  double totalTraveledDistance;
  boolean damaged;

  public double accelerate (double speed, double durationInHours){

    System.out.println(make + " is accelerating with " + speed + " km/h for " + durationInHours + "h" );

    double distance = speed * durationInHours;
    totalTraveledDistance = totalTraveledDistance + distance;
    //totalTraveledDistance += distance;

    System.out.println("total traveled distance: " + totalTraveledDistance);

    double usedFuel = distance * mileage / 100;
    fuelLevel = fuelLevel - usedFuel;

    System.out.println("Remaining fuel: " + fuelLevel);

    return distance;
  }
}
