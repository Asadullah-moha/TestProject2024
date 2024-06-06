package collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass2{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hannan");
        names.add("Iftekhar");
        names.add("Naima");
        names.add("Shuvashish");
        int count = 0;

        //find out number of 'a' in the array
        for (String name: names){
            for(int i =0; i<name.length(); i++){
                if (name.charAt(i) == 'a'){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    //write a method which will take 2 list and
    //return a list with the values of the list

    public List<Integer> combineList(List<Integer> nums1, List<Integer> nums2){
        for (int num :nums2){
            nums1.add(num);
        }
        return nums1;
    }
}
