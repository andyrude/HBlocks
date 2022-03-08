package leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] arr = new int[n1][n2];
        for ( int i = 0; i < n1; i++){
            for ( int j = 0; j < n2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println( find( arr));
    }

    private static int find(int[][] arr) {
        int n1 = arr.length;
        int n2 = arr[0].length;
        boolean[][] dp = new boolean[ n1][ n2];
        for ( int i = 0; i < n1; i++){
            Arrays.fill( dp[i], false);
        }
        for ( int i = 0; i < n1; i++){
            for ( int j = 0; j < n2; j++){
                if( dp[i][j]){
                    dfs( i , j, dp);
                }
            }
        }
    }

    private static void dfs(int i, int j, boolean[][] dp) {

    }
}
