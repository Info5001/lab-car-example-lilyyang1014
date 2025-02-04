package model;

public class Engine {
    int displacement;
    int horsepower;

    public Engine(int hp){              //constructor
        horsepower = hp;
    }
    
    
    public void start(){
        System.out.println("The engine with " + horsepower + " hp is starting");
    }

    public void breakDown(){
        System.out.println("The car is stopping");
    }
}
