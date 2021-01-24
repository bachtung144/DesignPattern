package creational.abstractFactory;

import creational.abstractFactory.typeProduct.chair.Chair;
import creational.abstractFactory.typeProduct.table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}
