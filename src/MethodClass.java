import classes.Fruit;

public class MethodClass {
    public static void main(String[] args) {
        int num1= 5;
        int num2= 6;
        int sum = num1 +num2;
        System.out.println(sum);

        System.out.println("Hello");
        System.out.println("World");

        addSum();
        addSum2(9,8);
        addSum2(90,70);
        printSquare(32);
        printLargerNumber(211,58);
        int lNum = returnLargerNumber(90, 91);
        System.out.println(lNum + " main method");
        int num3= 200;
        System.out.println("Sub is "+(num3 -lNum));
        Fruit fruit = new Fruit();
    }
    public static void addSum(){
        int num1= 9;
        int num2= 7;
        int sum = num1 +num2;
        System.out.println(sum);
}
    // when something is added in the parenthesis it called adding parameters
     public static void addSum2(int num1, int num2){
        int sum = num1 +num2;
        System.out.println("sum is "+sum);
    }
    public static void printSquare(int num) {
        int square = num * num;
        System.out.println("The square of " + num + " is: " + square);
        //or System.out.println(square), this will only give the number;
    }

    //write a method which takes 2 int parameters and print the larger value
    public static void printLargerNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " Is the larger number");
        } else {
            System.out.println(num2 + " Is the larger number");
        }
    }
        public static int returnLargerNumber(int num1, int num2) {
            if (num1 > num2) {
                return num1;
            }else {
                return num2;
            }
        }

    }


