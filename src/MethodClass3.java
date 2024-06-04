public class MethodClass3 {
    public static void main(String[] args) {
        //why do we need method?-----we need it to organize:
        //Modularity: Methods allow you to break down a large program into smaller, more manageable pieces. This makes the code easier to read, understand, and maintain.
        //Reusability: Once you have written a method, you can reuse it in multiple parts of your program. This saves time and reduces the amount of code you have to write.
        //Abstraction: Methods allow you to hide the implementation details of a piece of code and expose only the necessary functionality to the user. This makes the code easier to use and understand.
        //Encapsulation: Methods help you encapsulate data and behavior into a single unit, making it easier to manage and maintain.
        //Code organization: Methods help you organize your code in a logical and hierarchical manner. This makes it easier to navigate and find the code you need.
        //Testing: Methods make it easier to test your code because you can test each method independently. This helps you identify and fix bugs more quickly.
        addSum(9,3);
        addSum(9,3,7);
        addSum(7,7.5);
    }
    public static void addSum(int num1, int num2){
        System.out.println("Sum is "+(num1+num2));
    }
    public static void addSum(int num1, int num2, int num3) {
        System.out.println("Sum is "+(num1+num2+num3));
    }
    public static void addSum(int num1, double num2) {
        System.out.println("Sum is "+(num1+num2));
    }
}
