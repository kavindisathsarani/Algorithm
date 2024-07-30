package lk.ijse.fx.controller;

import java.util.Arrays;
import java.util.Scanner;

public class searchingIndexAlgorithm {
    public static void main(String[] args) {
        int[] nums={1,2,9,4,5,6};  /*null;*/

        //to use this algorithm the array must be a sorted one. for unsorted arrays this algorithm won't work
        //so for this that unsorted array should be converted into a sorted one.
        //for that binarySearch algorithm and selection sort algorithm should be used

        if(nums !=null) {
            System.out.println(Arrays.toString(selectionSort(nums)));
        }
        int[] ar=selectionSort(nums);

        if(ar!=null) {
            System.out.print("input number = ");
            int x = new Scanner(System.in).nextInt();
            if (binarySearch(ar, x)!=-1) {
                System.out.println("index = " + binarySearch(ar, x)); //binarySearch(nums,x);
            }else{
                System.out.println("index not found");
            }
        }else{
            System.out.println("\u001B[31m"+"array is empty");  //to print the sout in red
        }
    }
    public static int binarySearch(int[] arr, int target) { //binary search
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }

    private static int[] selectionSort(int[] ar) {
        if (ar != null) {
            for (int i = 0; i < ar.length - 1; i++) {
                int min = i;

                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[min] > ar[j]) {
                        min = j;
                    }
                }

                if (min != i) {
                    int temp = ar[i];
                    ar[i] = ar[min];
                    ar[min] = temp;

                }

            }

        }
        return ar;
    }
}
