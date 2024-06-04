package exam_prep;

public class Prep1 {
    public static void main(String[] args) {
        //starting point is the main method such as above.
        int num1 = 999;
        int num2 = 555;
        int num3 = 666;

        double numd = 99.99;
        char char1 = '#'; // no arithmetic/ equations, only characters can be letters, single numbers or symbols.
        System.out.println("Sum is " + (char1 + num1));//with () the output will be 1034
        System.out.println("Sum is " + char1 + num1); //without () the output will be #999

        boolean bool = true; // boolean can only keep "True" or "False" values.

        System.out.println(5 > 4);


        //whenever we have to make decisions/ such as comparisons.
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest");
        } else {
            System.out.println(num3 + " is the smallest");
        }


        int month = 3;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("March");
                break;
        }
// first one will give different value then the second and third
        for (int i= 1; i<5; i++) {
            i++;
            System.out.println(i + 2);
        }
        for (int i= 1; i<5; i++) {
            System.out.println(i + 2);
            i++;
        }
        for (int i= 1; i<5; i=i+2) {
            i++;
            System.out.println(i + 2);
        }
//find submission of all the numbers from 1-100
       int sum=0;

        for(int i = 1; i<=100; i++){
           if (i%2==0){
               sum = sum + i;
           }
       }
        System.out.println(sum);

        // find how many leap years are there between 1911 and 2024
        int count = 0;
        int year = 1;
        for(int i = 1911; i<=2024; i++){
            if (i%4==0){
                System.out.println("year: "+i);
                count++;
            }
        }
        System.out.println(count);

        int i = 15;

        do{
            System.out.println(i);
            i++;
        }while (i<22);

        i = 15;
        while (i<20){
            if (i==18){
                break;
            }
             System.out.println("inside while loop "+i);
            
             i++;
        }
        System.out.println(i);

        for (i=15; i<22; i++){
            if (i==18){
                continue;
            }
             System.out.println("inside while loop "+i);
        }
        System.out.println(i);
    }
}