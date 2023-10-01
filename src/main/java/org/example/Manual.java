package org.example;

public class Manual implements CarTransmissionStrategy{
    @Override
    public String transmission() {
        return "manually shifting between gears";
    }
}
