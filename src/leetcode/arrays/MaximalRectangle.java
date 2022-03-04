package leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximalRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for ( int i = 0; i < m; i++){
            for ( int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println( sol( arr));
    }

    private static int sol(int[][] arr) {
        int area = 0;
        int[][] dp = new int[ arr.length][arr[0].length];
        for ( int i = 0; i < arr[0].length; i++){
            dp[0][i] = arr[0][i];
            if( arr[0][i] == 1){
                area = 1;
            }
        }
        for ( int i = 1; i < arr.length; i++){
                for ( int j = 0; j < arr[0].length; j++){
                    if ( arr[i][j] == 0){
                        dp[i][j] = 0;
                    }else{
                        dp[i][j] = dp[i-1][j] + 1;
                    }
                }
                area = area >= getMaxHistogram( dp[i])? area: getMaxHistogram( dp[i]);
        }
        return area;
    }


    private static int getMaxHistogram(int[] arr) {
        int[] rs = new int[arr.length];
        int[] ls = new int[arr.length];
        int[] k = new int[arr.length];
        for ( int i = 0; i < arr.length; i++){
            int j = i;
            if ( i == arr.length - 1){
                rs[i] = arr.length;
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
            rs[i] = j  ;
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
            ls[i] = j + 1;
        }
        for ( int i = 0; i < arr.length; i++){
            k[i] = Math.abs( ls[i] - rs[i]  ) * arr[i];
        }

        return Arrays.stream(k).max().getAsInt();
    }
}
