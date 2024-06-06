package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListClass {
    // there are two types of list(is and interface)--ArrayList and
    public static void main(String[] args) {
        int[] nums = new int[4];
       //primitive type
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 9;
        nums[3] = 10;


        //class type
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers.get(1));
        numbers.add(15);
        System.out.println(numbers.get(3));
        numbers.add(3,7);
        System.out.println(numbers.get(3));
        System.out.println(numbers.size());

        System.out.println(numbers.contains(10));
        System.out.println(numbers.contains(11));

//        for (int i = 0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
        for (int number : numbers ){
            System.out.println(numbers);
        }

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(6);
        integers.add(9);
        integers.add(10);

        addSumList(numbers);
        addSumList(integers);

    }

    private static void addSumList(ArrayList<Integer> numbers) {
    }

    public static void addSumList(LinkedList<Integer> arrayList){
        int sum = 0;
        for (int num : arrayList){
            sum = sum+num;
        }

        System.out.println("Sum is "+sum);
    }
}
