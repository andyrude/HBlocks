package leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[ n][ k];
        for ( int i = 0; i < arr.length; i++){
            for ( int j = 0; j < k; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println( minPathSum( arr));
    }

    private static int minPathSum(int[][] arr) {

        int[][] dp = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];
        for ( int i = 1; i < arr[0].length; i++){
            dp[0][i] = dp[0][i - 1] + arr[0][i];
        }
        for ( int i = 1; i < arr.length; i++){
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }
        for ( int i = 1; i < arr.length; i++){
            for ( int j = 1; j < arr[0].length; j++){
                dp[i][j] = Math.min( arr[i][j] + dp[i - 1][j], arr[i][j] + dp[i][ j - 1]);
            }
        }
        for ( int i = 0; i < arr.length; i++){
            System.out.println( Arrays.toString(dp[i]));
        }
        return dp[arr.length - 1][arr[0].length - 1];
    }
}
