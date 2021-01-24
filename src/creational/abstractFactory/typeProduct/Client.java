package creational.abstractFactory.typeProduct;

import creational.abstractFactory.FurnitureAbstractFactory;
import creational.abstractFactory.FurnitureFactory;
import creational.abstractFactory.MaterialType;
import creational.abstractFactory.typeProduct.chair.Chair;
import creational.abstractFactory.typeProduct.table.Table;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}
