package org.example;


import org.example.cheater.CheatingVehicle;

public class App
{
    public static void main( String[] args )
    {
//       Game game = new Game();
//       game.start();

//      //polymorphism
//      Vehicle vehicle = new CheatingVehicle();
//      vehicle.setMake("Cheating vehicle");
//
//      //object type determines method implementation
//      vehicle.accelerate(60,1);
//      System.out.println("Accelerate with 1 param");
//      vehicle.accelerate(60);
//
//      //variable type determines what methods can be invoked
//      //type casting
//      ((CheatingVehicle) vehicle).cheat();

      //linia de mai sus pe larg
//      CheatingVehicle cheatingVehicle = (CheatingVehicle) vehicle;
//      cheatingVehicle.cheat();
//
//       Vehicle vehicle1 = new Vehicle();
//       vehicle1.setMake("VW");
//       vehicle1.setModel("Golf");
//       vehicle1.setColor("red");
//
//       vehicle1.accelerate(60,1);
//

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;

        Car car = new Car(engine1);
//        car.make = "Skoda";
//        car.model = "Fabia";
//        car.mileage = 7.5;
//        car.fuelLevel = 60;
//        car.color = "red";
//        car.maxSpeed = 300;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        AutoVehicle autoVehicle = new AutoVehicle(engine);

//
//        carReference.engine = engine1;
//
//        double currentDistance = carReference.accelerate(60,1);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//
//        Car car2 = new Car();
//        car2.getMake() = "Mercedes";
//        car2.model = "CLS";
//        car2.color = "black";

  //      double car2Distance = car2.accelerate(120, 3);


    }
}
