import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner helps to read the value from console
        System.out.println("How many odd number you want to see : ");
        int n = scanner.nextInt(); //get the value from console
        int i = 0;
        int count = 0;

        do {
            if (i % 2 == 1) {
                System.out.println(i);
                count++;
            }
            i++;
        } while (count < n);

        int[] nums = {2, 6, 9, 8, 2, 3, 6, 2};
        count = 0;
        //find total number of 2 in the array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 2 && nums[j + 1] == 2) {
                count++;
            }
        }
        System.out.println("count is : " + count);
//        find out if there are two 2 together in the array
//        int[] nums = {2, 6, 2, 3, 6, 2, 2, 2};
        count = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == 2 && nums[j + 1] == 2) {
                count++;
            }
        }
        System.out.println("count is : " + count);
    }
}