import ClassFruits.Fruit;

public class Store <T extends Fruit>{
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

    @Override
    public String toString() {
        return "Store:" + value +" " + fruit.getName() + "(s)";
    }
}
