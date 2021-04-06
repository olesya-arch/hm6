package com.company;

public class Motorcycle extends Vehicle {
    private int maxSpeed;

    public Motorcycle (int wheelcount, int maxSpeed) {
        super(wheelcount);
        this.maxSpeed = maxSpeed;
    }
    @Override

    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл - Количество колес: " + wheelCount
                + " - Максимальная скорость: " + maxSpeed + " км/ч");
    }
}
