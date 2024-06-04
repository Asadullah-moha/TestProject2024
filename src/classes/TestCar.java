package classes;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Test car";
        Toyota toyota = new Toyota();
        //toyota.isreliable = false;
        System.out.println(toyota.isReliable);
        toyota.startEngine();
    }
}
