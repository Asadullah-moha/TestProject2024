package exam_prep;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaExam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1= scanner.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = scanner.nextInt();

        if(num1>=50 && num1<=100 && num2>50 && num2<100 ){
            if(num1>num2){
                System.out.println(num1+" is bigger");
            }else {
                System.out.println(num2+" is bigger");
            }
        }else{
            System.out.println("Invalid number");
        }
//***********Question-3
        System.out.println("Enter starting point");
        int num3=scanner.nextInt();
        System.out.println("Enter ending point");
        int num4= scanner.nextInt();
        int count = 0;

        for(int i=num3; i<num4; i++){
            if(i%3==0){
                System.out.println(i);
                count++;
            }
            if(count==5){
                break;
            }
        }

    }

    public static void PrintArraySumEqualOrNot(int[] nums1, int[] nums2){
        int sum1 = 0;
        int sum2= 0;

        for (int i =0; i<nums1.length; i++){
            sum1 = sum1+nums1[i];
        }

        for (int i =0; i<nums2.length; i++){
            sum2 = sum2+nums2[i];
        }
        if (sum1==sum2){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

}
