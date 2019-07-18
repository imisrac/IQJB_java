package fuits;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotEquals;

public class FruitFactoryTest {

    private FruitFactory fruitFactory = new FruitFactory();

    @Test
    public void create() {
        MatcherAssert.assertThat(fruitFactory.create("apple").getType(), is("apple"));
    }

    @Test
    public void test_two_fruit() {
        Fruit fruit1 = fruitFactory.create("banana");
        Fruit fruit2 = fruitFactory.create("banana");

        assertNotEquals(fruit1.hashCode(), fruit2.hashCode());
    }
}