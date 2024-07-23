package lk.ijse.fx.controller;

import java.util.Scanner;

public class BinaryAlgorithm {
    public static int search(int[] x, int y){
       int z= (x.length)/2;
        for (int i = 0; i < x.length; i++) {
            if (y == (z+1+x.length)/2) {
                return z+1;
            }
            z=0;
        }
       return 0;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        System.out.print("input number = ");
        int x= new Scanner(System.in).nextInt();

        System.out.println("index = "+search(nums,x));
    }
}
