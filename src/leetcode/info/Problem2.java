package leetcode.info;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[][] dp = new int[ n][ n];
        dp[0][0] = 1;
        for ( int i= 0 ; i < n; i++){
            Arrays.fill( dp[i], 0);
        }
        int k = sc.nextInt();
        for ( int  i = 0; i < n; i++){
            for ( int j = 0; i < n; j++){
                for ( int h = 1; h < k; h++){
                    if (i + h  < n) {
                        dp[j][i+h] = dp[j][i] + 1 + dp[ j][i + h];
                    }
                    if ( j + h  < n){
                        dp[j + h][i] = dp[j][i] + 1 + dp[ j + h][i];
                    }
                    if ( i + h < n && j + h < n){
                        dp[j + h][ i + h] = dp[ j ][i] + 1;
                    }
                }
            }
        }
        for ( int i = 0; i < n ; i++){
            System.out.println( Arrays.toString( dp[i]));
        }
    }
}
