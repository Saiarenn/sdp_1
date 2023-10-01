package org.example;

public class Gas implements CarEngineStrategy{
    @Override
    public String engine() {
        return "drives through burning a gas";
    }
}
