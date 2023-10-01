package org.example;

public class BMW extends Car{
    public BMW() {
        setEngine(new Gas());
        setTransmission(new Manual());
    }

    public void display() {
        System.out.println("BMW " + super.toString());
    }
}
