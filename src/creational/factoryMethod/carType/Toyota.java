package creational.factoryMethod.carType;

import creational.factoryMethod.Car;

public class Toyota implements Car {
    @Override
    public void view() {
        System.out.println("Toyota view");
    }
}
