package lk.ijse.fx.controller;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,5};
        //to use this algorithm the array must be a sorted one. for unsorted arrays this algorithm won't work

        System.out.print("input number = ");
        int x= new Scanner(System.in).nextInt();
        System.out.println("index = "+binarySearch(nums,x)); //binarySearch(nums,x);
    }
    public static int binarySearch(int[] arr, int target) {
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
