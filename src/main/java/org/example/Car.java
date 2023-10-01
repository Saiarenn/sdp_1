package org.example;

public abstract class Car {

    private CarEngineStrategy engine;
    private CarTransmissionStrategy transmission;

    public void setTransmission(CarTransmissionStrategy transmission) {
        this.transmission = transmission;
    }

    public void setEngine(CarEngineStrategy engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "{ \n" +
                "engine = " + engine.engine() +
                ",\ntransmission = " + transmission.transmission() +
                "\n}";
    }

    public void display() {
    }
}

