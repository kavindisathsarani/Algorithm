package lk.ijse.fx.controller;

import java.util.Arrays;

public class ReverseArrayWithoutUsingTemp {
    //Reverse an array only using temp variable. don't use temp array to reverse the array just temp variable


    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 2, 10};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
    }
}



