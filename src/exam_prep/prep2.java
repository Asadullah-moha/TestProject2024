package exam_prep;

import java.util.Scanner;
public class prep2 {
    public static void main(String[] args) {
//        how do we declare an array

        int[] nums = new int[10];
        int[] numbers = {2, 9, 8, 6, 5, 7, 5, 3, 9}; //length is how many numbers it contains
        System.out.println(numbers.length);

        System.out.println(numbers[5]); //to get the index number

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //get the sum of the values of the array
        //stop the loop when sum > 50
        //Print the value/index when it is stopping.

        int[] numbers1 = {2, 9, 8, 6, 25, 7, 5, 3, 9};
        int sum = 0;

        for (int i = 0; i < numbers1.length; i++) {
            sum = sum + numbers1[i];
            if (sum > 50) {
                System.out.println("index: " + i);
                System.out.println("sum: " + sum);
                break;
            }
        }
    }
}