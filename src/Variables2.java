import java.util.Scanner;

public class Variables2 {
    public static void main(String[] args){

//        int i = 10;
//        System.out.println(i++);// i ++ increment will execute after method//
//        System.out.println(i);
//            System.out.println(++i);// ++i increment will execute before method//
//            System.out.println(i);

        // % modulus(mod) this is a logical operator.
        // why do we need the modulator? we need this for many applications.
        // odd and even numbers (0 is an even number)
//        System.out.println(17%3);
//
//        int i = -6;
//        i+=1;
//
//
//        if(i%2==1) {
//            System.out.println(i+ " is and odd number");
//        }else {
//            System.out.println(i+ " is an even number");
//        }
//
//        //
//        if (i>=0) {
//            System.out.println(i + " is a positive number");
//        } else {
//            System.out.println(i + " is a negative number");
//        }
//
//
//        int weekday = 7;
//
//        if (weekday == 1) {
//            System.out.println("Today is Monday");
//        } else if (weekday == 2) {
//            System.out.println("Today is Tuesday");
//        } else if (weekday == 3) {
//            System.out.println("Today is Wednesday");
//        } else if (weekday == 4) {
//            System.out.println("Today is Thursday");
//        } else if (weekday == 5) {
//            System.out.println("Today is Friday");
//        } else if (weekday == 6) {
//            System.out.println("Today is Saturday");
//        } else if (weekday == 7) {
//            System.out.println("Today is Sunday");
//        } else {
//            System.out.println("Invalid weekday");
//        }

        // loops : coming back to where we started/ full circle
        //
        Scanner scanner = new Scanner (System.in);
//        System.out.println("Enter a number ");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter another number ");
//        int num2 = scanner.nextInt();
//        if (num2>num1){
//            System.out.println(num2 + "is higher number");
//        } else {
//            System.out.println(num1 + "is higher number ");
//        }


        System.out.println("Enter month's number");
        int month =scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Nothing matched");
        }
    }

}
