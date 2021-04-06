package com.company;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car(4, 5, 20000);
	Car car2 = new Car(4, 4, 15000);
	Motorcycle motorcycle1 = new Motorcycle(2,170);
	Motorcycle motorcycle2 = new Motorcycle(3,130);
	car1.printInfo();
	car2.printInfo();
	motorcycle1.printInfo();
	motorcycle2.printInfo();



    }
}
