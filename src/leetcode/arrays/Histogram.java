package leetcode.arrays;

import java.util.Arrays;
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
        int[] k = new int[arr.length];
        for ( int i = 0; i < arr.length; i++){
            int j = i;
            if ( i == arr.length - 1){
                rs[i] = 0;
                break;
            }else {
                while (arr[j] >= arr[i]) {
                    j++;
                    if (j >= arr.length) {
                        rs[i] = arr.length - 1;
                        break;
                    }
                }
            }
            rs[i] = j;
        }

        for ( int i = arr.length - 1; i >= 0; i--){
            int j = i;
            if ( i == 0){
                ls[i] = 0;
                break;
            }
            while ( arr[j] >= arr[i]){
                j--;
                if ( j <= 0){
                    ls[i] = 0;
                    break;
                }
                System.out.println(j);
            }
            ls[i] = j;
        }
        for ( int i = 0; i < arr.length; i++){
            k[i] = Math.abs( ls[i] - rs[i]  +  1) * arr[i];
        }
        System.out.println(Arrays.toString( ls));
        System.out.println(Arrays.toString( rs));
        System.out.println(Arrays.toString( k));
    }
}
