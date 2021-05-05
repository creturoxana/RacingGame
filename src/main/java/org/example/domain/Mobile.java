package org.example.domain;

public interface Mobile {

  double accelerate(double speed, double durationInHours);

  String getName();

  boolean canMove();

  double getTotalTraveledDistance();

}
