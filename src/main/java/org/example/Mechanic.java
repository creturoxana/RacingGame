package org.example;

public class Mechanic {

    public void repair(Vehicle vehicle){
      System.out.println("Repairing vehicle " + vehicle.make);

      vehicle.damaged = false;
    }
}
