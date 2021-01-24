package creational.factoryMethod.carType;

import creational.factoryMethod.Car;

public class Honda implements Car {
    @Override
    public void view() {
        System.out.println("Honda view");
    }
}
