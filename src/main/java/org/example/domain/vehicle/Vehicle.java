package org.example.domain.vehicle;

import org.example.domain.Mobile;

public abstract class  Vehicle implements Mobile {

  //class variable / static variable
  private static int totalVehicleCount;

  //instance variables
  private String make;
  private String model;
  private String color;
  private double mileage;
  private double fuelLevel;
  private double maxSpeed;
  protected double totalTraveledDistance;
  private boolean damaged;

  public Vehicle() { totalVehicleCount++; }

  //method overloading
  public double accelerate (double speed){
    return accelerate(speed,1);
  }

  public double accelerate (double speed, double durationInHours){

    if (speed > maxSpeed) {
      System.out.println("Max speed exceeded.");
      return 0;
    }

    if (!canMove()) {
      System.out.println("You cannot accelerate.");
      return 0;
    }

    System.out.println(make + " is accelerating with " + speed + " km/h for " + durationInHours + "h" );

    double distance = speed * durationInHours;
    totalTraveledDistance = totalTraveledDistance + distance;
    //totalTraveledDistance += distance;

    System.out.println("total traveled distance: " + totalTraveledDistance);

    //use more fuel if speed > 120 km/h
    double mileageMultiplier =1;
    if (speed > 120) {
      mileageMultiplier = speed / 100;
    }

    double usedFuel = distance * mileage / 100;
    usedFuel *= mileageMultiplier;

    fuelLevel = fuelLevel - usedFuel;

    System.out.println("Remaining fuel: " + fuelLevel);

    return distance;
  }

  @Override
  public String getName() {
    return make;
  }

  @Override
  public boolean canMove() {
    return fuelLevel > 0 && !damaged;
  }

  protected Vehicle reset(){
      totalTraveledDistance = 0;
      fuelLevel = 0;
      damaged = false;

      return this;
    }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getMileage() {
    return mileage;
  }

  public void setMileage(double mileage) {
    this.mileage = mileage;
  }

  public double getFuelLevel() {
    return fuelLevel;
  }

  public void setFuelLevel(double fuelLevel) {
    this.fuelLevel = fuelLevel;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public double getTotalTraveledDistance() {
    return totalTraveledDistance;
  }

  public void setTotalTraveledDistance(double totalTraveledDistance) {
    this.totalTraveledDistance = totalTraveledDistance;
  }

  public boolean isDamaged() {
    return damaged;
  }

  public void setDamaged(boolean damaged) {
    this.damaged = damaged;
  }

  //read-only variable
  public static int getTotalVehicleCount() {
    return totalVehicleCount;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "make='" + make + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", mileage=" + mileage +
        ", fuelLevel=" + fuelLevel +
        ", maxSpeed=" + maxSpeed +
        ", totalTraveledDistance=" + totalTraveledDistance +
        ", damaged=" + damaged +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Vehicle vehicle = (Vehicle) o;

    if (Double.compare(vehicle.mileage, mileage) != 0) {
      return false;
    }
    if (Double.compare(vehicle.fuelLevel, fuelLevel) != 0) {
      return false;
    }
    if (Double.compare(vehicle.maxSpeed, maxSpeed) != 0) {
      return false;
    }
    if (Double.compare(vehicle.totalTraveledDistance, totalTraveledDistance) != 0) {
      return false;
    }
    if (damaged != vehicle.damaged) {
      return false;
    }
    if (make != null ? !make.equals(vehicle.make) : vehicle.make != null) {
      return false;
    }
    if (model != null ? !model.equals(vehicle.model) : vehicle.model != null) {
      return false;
    }
    return color != null ? color.equals(vehicle.color) : vehicle.color == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = make != null ? make.hashCode() : 0;
    result = 31 * result + (model != null ? model.hashCode() : 0);
    result = 31 * result + (color != null ? color.hashCode() : 0);
    temp = Double.doubleToLongBits(mileage);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(fuelLevel);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(maxSpeed);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(totalTraveledDistance);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (damaged ? 1 : 0);
    return result;
  }
}
