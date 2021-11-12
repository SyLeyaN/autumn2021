import ClassFruits.Fruit;

public class Farm<T extends Fruit> {
    private int value;
    private T fruit;

    public Farm(int value, T fruit){
        this.value=value;
        this.fruit=fruit;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value=value;
    }

    public String getFruitType(){
        return fruit.getName();
    }

    public void transferTo(FruitVan fruitVan){
        fruitVan.setValue(value);
        fruitVan.setFruit(fruit);
        this.value=0;

    }
}
