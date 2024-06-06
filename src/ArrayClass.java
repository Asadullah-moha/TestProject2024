public class ArrayClass {

    public static void main(String[] args) {

        int num =9;
        int[] nums = new int[5];
        nums[0] = 9;
        nums[3] = 10;
        nums[4] = nums[0]+nums[3];

//        System.out.println(nums[4]);
//        System.out.println(nums[1]);

        int[] numbers = {2,6,3,2,15,4,9};

//        System.out.println(numbers[6]);

//        System.out.println(numbers.length);

//        System.out.println(numbers[4]);

        int sum =0;

        System.out.println(numbers[0]);

        System.out.println(numbers[5]);



        for (int i =0; i<numbers.length; i++ ){

            //System.out.println(numbers[i]);

            sum =sum+numbers[i];

            //System.out.println(numbers[i]);

        }

        System.out.println(sum);

        int max = numbers[6];

        //find highest value inside the array

        for (int i =0; i<numbers.length; i++){

            if(numbers[i]>max){

                max = numbers[i];

            }

        }

        System.out.println(max);

        //print all the odd numbers from the array

        // int[] numbers = {2,6,3,2,15,4,9};

        for (int i =0; i<numbers.length; i++){

            if(numbers[i]%2==1){

                System.out.println(numbers[i]);

            }

        }

    }

}