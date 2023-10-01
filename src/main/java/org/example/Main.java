package org.example;

public class Main {
    public static void main(String[] args) {
        Car bmw = new BMW();
        bmw.display();

        Car tesla = new Tesla();
        tesla.display();

        System.out.println("BMW\'s new car");

        bmw.setEngine(new Electric());
        bmw.display();
    }
}