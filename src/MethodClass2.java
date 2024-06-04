import jdk.dynalink.beans.StaticClass;

public class MethodClass2 {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 7, 5, 3, 9, 12};
        int[] numbers1 = {4, 6, 7, 5, 3, 9, 12};
        int[] numbers2 = {1, 2, 3, 4, 5};
        int sum=getSum(numbers);
        System.out.println(sum);
        printMoreNumbers(numbers1, numbers2);
    }

    public static int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    //create a method which will take 2 int[] parameters
    // and print which array contains more numbers
    public static void printMoreNumbers(int[] numbers1, int[] numbers2) {
        if (numbers1.length > numbers2.length) {
            System.out.println("Numbers 1 has more numbers.");
        } else if (numbers1.length < numbers2.length) {
            System.out.println("Numbers 2 has more numbers.");
        } else {
            System.out.println("Both contain the same amount of numbers.");
        }

//        public Static void printLargerArray(int[] nums1, int[] nums2){
//            if(nums1.length > nums2.length){
//                System.out.println("First array is larger");
//            } else if (nums2.length > nums1.length) {
//
//            }
//        }
    }

}
