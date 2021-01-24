package creational.abstractFactory.typeFactory;

import creational.abstractFactory.FurnitureAbstractFactory;
import creational.abstractFactory.typeProduct.chair.Chair;
import creational.abstractFactory.typeProduct.chair.PlasticChair;
import creational.abstractFactory.typeProduct.table.PlasticTable;
import creational.abstractFactory.typeProduct.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
