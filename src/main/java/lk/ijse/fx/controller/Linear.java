package lk.ijse.fx.controller;

import java.util.Scanner;

public class Linear {

    public static int search(int[] x, int y){
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] nums={10,2,8,3,4,5};

        System.out.print("input number = ");
        int x= new Scanner(System.in).nextInt();

        System.out.println("index = "+search(nums,x));
    }
}
