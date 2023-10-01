package org.example;

public class Electric implements CarEngineStrategy{
    @Override
    public String engine() {
        return "drives through electric energy";
    }
}
