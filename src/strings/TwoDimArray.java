package strings;

import java.util.Random;

public class TwoDimArray {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[][] nums2 = new int[3][4];
        nums2[0][0] = 5;

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + " + " + j);
            }

//            for (int i =0; i<3; i++) {
//                int j;
//                for (j = 0; j < 4; j++) {
//
//                }
//                // System.out.println(i+" , "+j+" ");
//                nums2[i][j] = random.nextInt(50);
//            }
//            System.out.println();
        }
    }
}

