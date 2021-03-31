package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );

        Car carReference = new Car();
        carReference.make = "Skoda";
        carReference.model = "Fabia";
        carReference.mileage = 7.5;
        carReference.fuelLevel = 60;
        carReference.color = "red";
        carReference.maxSpeed = 300;

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;

        carReference.engine = engine1;
    }
}
