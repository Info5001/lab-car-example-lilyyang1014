package model;


// This class describes a car
public class Car {
    String manufacturer;
    int year;
    String modelName;
    String type; //suv, truck, coupe

    Engine veryPowerfulEngine;      //declare a member variable of type Engine，which will be used to store an Engine object(initialized in the constructor)
    Wheel frontLeftWheel;
    Wheel frontRightWheel;
    Wheel rearLeftWheel;
    Wheel rearRightWheel;

    public Car(String m, String md, int y, int hp){       //constructor，which will be automatically used when creating a new car. it accpts 4 parameters(m, md, y, hp), and then 
        manufacturer = m;
        modelName = md;
        year = y;

        veryPowerfulEngine = new Engine(hp);
        frontLeftWheel = new Wheel();
        frontRightWheel = new Wheel();
        rearLeftWheel = new Wheel();
        rearRightWheel = new Wheel();
    

    }
    
    public void drive(){
        System.out.println(modelName + " is driving");
        int speed = frontLeftWheel.getSpeed();
        System.out.println("The speed of the car is "  + speed);
    }

    public void makeATurn(){
        System.out.println(modelName + " is making a turn");
    }

    public void stop(){
        System.out.println(modelName + " is stopping");
    }
    
    public void startTheEngine(){
        System.out.println(modelName + " is starting");
        veryPowerfulEngine.start();
    }

    public void setModelName(String n){
        modelName = n;
    }

}