package org.example;

// "is-a" relationship (inheritance)
public class Car extends AutoVehicle {

  private int doorCount;


  public Car(Engine engine) {
    super(engine);
  }

  //constructor overloading
  public Car() {
    this(new Engine());
  }

  public int getDoorCount() {
    return doorCount;
  }

  public void setDoorCount(int doorCount) {
    this.doorCount = doorCount;
  }

  @Override
  public String toString() {
    return "Car{" +
        "doorCount=" + doorCount +
        "} " + super.toString();
  }
}
