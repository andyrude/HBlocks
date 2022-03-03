package leetcode.arrays;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        getMaxHistogram( arr, str.length);
    }

    private static void getMaxHistogram(int[] arr, int length) {
        int[] rs = new int[arr.length];
        int[] ls = new int[arr.length];

    }
}
