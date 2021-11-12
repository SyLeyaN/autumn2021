import ClassFruits.Apple;
import ClassFruits.Durian;
import ClassFruits.Fruit;
import ClassFruits.Orange;

public class Main {
    public static void main(String[] args) {
        Farm<? extends Fruit> farm1 = new Farm<Apple>( 10, new Apple());
        Farm<? extends Fruit> farm2 = new Farm<Orange>(23, new Orange());
        Farm<? extends Fruit> farm3 = new Farm<Durian>(9, new Durian());

        FruitVan<? extends Fruit> fruitVan1 = new FruitVan<Apple>();
        FruitVan<? extends Fruit> fruitVan2 = new FruitVan<Orange>();
        FruitVan<? extends Fruit> fruitVan3 = new FruitVan<Durian>();

        Store<? extends Fruit> store1 = new Store<Apple>();
        Store<? extends Fruit> store2 = new Store<Orange>();
        Store<? extends Fruit> store3 = new Store<Durian>();

        farm1.transferTo(fruitVan1);
        farm2.transferTo(fruitVan2);
        farm3.transferTo(fruitVan3);

        fruitVan1.transferTo(store1);
        fruitVan2.transferTo(store2);
        fruitVan3.transferTo(store3);

        System.out.println(store1.toString());
        System.out.println(store2.toString());
        System.out.println(store3.toString());

        //System.out.println(farm.getFruitType());
    }
}
