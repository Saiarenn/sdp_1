package org.example;

public class Automatic implements CarTransmissionStrategy{
    @Override
    public String transmission() {
        return "automatically changes gears";
    }
}
