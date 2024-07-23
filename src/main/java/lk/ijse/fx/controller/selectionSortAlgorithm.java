package lk.ijse.fx.controller;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSortAlgorithm {

    public static void main(String[] args) {
        int[] nums={1,0,10,4,5,6};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    private static int[] selectionSort(int[] ar) {

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

        return ar;
    }
}
