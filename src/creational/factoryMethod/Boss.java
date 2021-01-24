package creational.factoryMethod;

import creational.factoryMethod.carType.Honda;
import creational.factoryMethod.carType.Nesux;
import creational.factoryMethod.carType.Toyota;

public class Boss {
    public void viewHonda() {
        Honda honda = new Honda();
        honda.view();
    }

    public void viewNexus() {
        Nesux nexus = new Nesux();
        nexus.view();
    }

    public void viewToyota(){
        Toyota toyota = new Toyota();
        toyota.view();
    }
}
