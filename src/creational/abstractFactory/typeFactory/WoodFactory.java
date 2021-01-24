package creational.abstractFactory.typeFactory;

import creational.abstractFactory.FurnitureAbstractFactory;
import creational.abstractFactory.typeProduct.chair.Chair;
import creational.abstractFactory.typeProduct.chair.WoodChair;
import creational.abstractFactory.typeProduct.table.Table;
import creational.abstractFactory.typeProduct.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
