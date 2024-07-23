package lk.ijse.fx.controller;

import java.util.Scanner;

public class modifiedLinearSearch {
    public static int search(int[] x, int y) {
        if (x ==null) {
           // System.out.println("\u001B[31m"+"array is empty");
        }else {

            for (int i = 0; i < x.length; i++) {

                if (x[i] == y) {
                    return i;
                }
            }
            System.out.println("index not found");

        }
            return -1;

    }

    public static void main(String[] args) {
        int[] nums ={10,2,8,3,4,5}; /*null;*/

        if (nums !=null) {
            System.out.print("input number = ");
            int x = new Scanner(System.in).nextInt();

            if (search(nums, x) != -1) {
                if (nums != null) {
                    System.out.println("index = " + search(nums, x));
                }
            }
        }else{
            System.out.println("\u001B[31m"+"array is empty");
        }
    }
}
