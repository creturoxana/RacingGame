package org.example.cheater;

import org.example.Vehicle;

public class CheatingVehicle extends Vehicle {

  //constant
  public static final String TYPE = "Cheater";

  @Override
  public double accelerate(double speed, double durationInHours) {
    System.out.println (getMake() + " is accelerating with " + speed + " km/h for " + durationInHours + "h");
    System.out.println("Cheating...");

    double distance = speed * durationInHours *2;
    totalTraveledDistance += distance;

    return distance;
  }

  public void cheat() {
    totalTraveledDistance *= 2;
  }

// co-variant return type
  // overriding method can be more permissive
  @Override
  public CheatingVehicle reset() {
    super.reset();
    return this;
  }
}
