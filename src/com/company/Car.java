package com.company;

import com.company.api.Costable;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    int cost;


    public Car (int wheelCount, int doorsCount, int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина - Количество дверей: "
                + doorsCount + " - Количество колес: " + wheelCount + " - Цена: " + getCost() + "$");
    }
    @Override
    public int getCost() {
        return cost; }
}
