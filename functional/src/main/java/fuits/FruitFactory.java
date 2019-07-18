package fuits;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class FruitFactory {

    private List<Supplier<Fruit>> fruitList = new ArrayList<>();

    FruitFactory() {
        fruitList.add(Apple::new);
        fruitList.add(Banana::new);
        fruitList.add(Orange::new);
    }

    Fruit create(String type) {
        return fruitList.stream().map(Supplier::get).filter(fruit -> fruit.getType().equals(type)).findFirst().orElseThrow(NoClassDefFoundError::new);
    }
}
