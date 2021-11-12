import ClassFruits.Fruit;

public class FruitVan<T extends Fruit> {
    private int value;
    private T fruit;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setFruit(T fruit){
        this.fruit=fruit;
    }

    public void transferTo(Store store){
        store.setValue(value);
        store.setFruit(fruit);
        this.value=0;
    }
}
