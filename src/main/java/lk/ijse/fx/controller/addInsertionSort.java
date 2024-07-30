package lk.ijse.fx.controller;

import java.util.Arrays;
import java.util.Scanner;

public class addInsertionSort {

    //the number which is inputed through the keyboard should be placed in the array in sorted way
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};

        System.out.print("input number= ");
        int x = new Scanner(System.in).nextInt();

       int[] ar= placeNumbers(nums,x); //to add the value
        System.out.println(Arrays.toString(insertionSort(ar))); //to sort the array after the value is added

    }

    private static int[] placeNumbers(int[] nums,int x) {
        int[] ar=new int[nums.length+1];
        for (int i = 0; i < ar.length-1; i++) {
            ar[i]=nums[i];
            ar[ar.length-1]=x;
        }
        return ar;
    }

    private static int[] insertionSort(int[] ar) {

        for (int j = 1; j < ar.length; j++) {
            int temp = ar[j];
            int i = j-1;
            while ( (i > -1) && ( ar [i] > temp ) ) {
                ar [i+1] = ar [i];
                i--;
            }
            ar[i+1] = temp;
        }
        return ar;

    }

}
