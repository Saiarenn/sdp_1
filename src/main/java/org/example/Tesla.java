package org.example;

public class Tesla extends Car{
    public Tesla() {
        setEngine(new Electric());
        setTransmission(new Automatic());
    }

    public void display() {
        System.out.println("Tesla " + super.toString());
    }
}
