package classes;

public class FruitTest {

    public static void main(String[] args) {
        //scanner is a class, and comes from Java*/
        Fruit fruit = new Fruit();
        fruit.name = "Mango";
        fruit.color = "yellow";
        fruit.taste = "sweet";
        fruit.price = 2.99;
        fruit.eatFruit();

        Fruit fruit1 = new Fruit();
        fruit1.name = "Orange";
        fruit1.color = "orange";
        fruit1.taste = "sweet";
        fruit1.price = 2.65;
        fruit1.eatFruit();

        System.out.println(fruit1.color);
    }
}
