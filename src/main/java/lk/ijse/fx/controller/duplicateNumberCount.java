package lk.ijse.fx.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicateNumberCount {
    public static void main(String[] args) {
        int[] nums = {2, 10, 3, 10, 5,10,3};
        System.out.print("input number= ");
        int x = new Scanner(System.in).nextInt();

        if (nums!=null && checkNumber(nums,x)==true) {
            if (searchCount(nums, x) != 1) {
                System.out.println("duplicate count= " + searchCount(nums, x));
            } else {
                System.out.println("duplicates not found");
            }

            if (searchCount(nums, x) != 1) {
                printIndex(nums, x);
            }
        }else{
            System.out.println("number not found");
        }
    }

    private static boolean checkNumber(int[] nums,int x){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==x){
                return true;
            }
        }
        return false;
    }


    private static String printIndex(int[] nums, int x) {
        System.out.print("found in= ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

            }
            if (nums[i] == x) {
                System.out.print(i+" ,");
            }
        }
        System.out.print("\b ");

        return null;


        //using arrayList

         /* private static List<Integer> printIndex(int[] nums, int x) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indexes.add(i);
            }
        }
        return indexes;
    }*/

    }

    private static int searchCount(int[] nums,int x) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==x){
                count++;
            }

        }
        return count;
    }

}
