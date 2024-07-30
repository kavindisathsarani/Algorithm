package lk.ijse.fx.controller;

import java.util.Arrays;

public class insertionSortAlgorithm {

    public static void main(String[] args) {
        int[] nums={1,4,5,2,12,43,19,23};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }

    private static int[] insertionSort(int[] nums) {

        for (int j = 1; j < nums.length; j++) {
            int temp = nums[j];
            int i = j-1;
            while ( (i > -1) && ( nums [i] > temp ) ) {
                nums [i+1] = nums [i];
                i--;
            }
            nums[i+1] = temp;
        }
        return nums;

    }


}
