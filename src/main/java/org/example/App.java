package org.example;


public class App 
{
    public static void main( String[] args )
    {
       Game game = new Game();
       game.start();

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;

        Car car = new Car(engine1);
        car.make = "Skoda";
        car.model = "Fabia";
        car.mileage = 7.5;
        car.fuelLevel = 60;
        car.color = "red";
        car.maxSpeed = 300;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        AutoVehicle autoVehicle = new AutoVehicle(engine);


//        carReference.engine = engine1;
//
//        double currentDistance = carReference.accelerate(60,1);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//
//        Car car2 = new Car();
//        car2.make = "Mercedes";
//        car2.model = "CLS";
//        car2.color = "black";
//
//        double car2Distance = car2.accelerate(120, 3);
    }
}
