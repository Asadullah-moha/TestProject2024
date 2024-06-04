package classes2;

public class StaticTest {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.addValue(23);
        System.out.println(staticClass.getNum());

        StaticClass staticClass1 = new StaticClass();
        staticClass1.addValue(25);
        System.out.println(staticClass1.getNum());
    }
}
