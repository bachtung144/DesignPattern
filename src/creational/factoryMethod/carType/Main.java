package creational.factoryMethod.carType;

import creational.factoryMethod.Boss;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.viewHonda();
        boss.viewNexus();
        boss.viewToyota();
    }
}
