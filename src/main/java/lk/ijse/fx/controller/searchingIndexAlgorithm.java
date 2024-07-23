package lk.ijse.fx.controller;

import java.util.Scanner;

public class searchingIndexAlgorithm {
    public static void main(String[] args) {
        int[] nums={0,2,3,4,5,6};  /*null;*/

        if(nums!=null) {
            System.out.print("input number = ");
            int x = new Scanner(System.in).nextInt();
            if (binarySearch(nums, x)!=-1) {
                System.out.println("index = " + binarySearch(nums, x)); //binarySearch(nums,x);
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
}
