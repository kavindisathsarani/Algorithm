package lk.ijse.fx.controller;

import java.util.Scanner;

public class TwosomeAlgorithm {
    //when we input a number through the keyboard,print the values in the array that will help to create the inputed number

    public static void main(String[] args) {
        int[] nums={5,3,7,2,4,6,8,13,21};

            System.out.print("input number= ");
            int x = new Scanner(System.in).nextInt();
            if(nums !=null && checkNumber(nums,x)==true) {
                searchValues(nums, x);
            }else{
                System.out.println("array doesn't have such a number");
            }

    }

    private static boolean checkNumber(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==x){
                return true;
            }
        }
        return false;
    }

    private static void searchValues(int[] nums,int x) {
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==x){
                    System.out.println(nums[i]+"[index "+i+"]"+"+"+ nums[j]+"[index "+j+"]"+" = "+x);
                }
            }
        }
    }



}
