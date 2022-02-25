package Contest2853;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] wt = new int[n];
        for (int i = 0; i < n; i++){
            wt[i] = sc.nextInt();
        }
        int[] vala = new int[n];
        for ( int i = 0; i < n; i++){
            vala[i] = sc.nextInt();
        }
        System.out.println( getMaxKS( val, wt, vala));
    }

    private static int getMaxKS(int val, int[] wt, int[] vala) {
        int[][] dp = new int[ wt.length + 1][ val + 1];
        for (int i = 1; i <= wt.length; i++) {
            for (int j = 0; j <= val; j++) {
               if ( i == 0 || j == 0){
                   dp[i][j] = 0;
               }else if( j - wt[ i - 1] < 0){
                   dp[i][j] = dp[i - 1][j];
               }else{
                   dp[i][j] = Math.max( dp[ i - 1][j], dp[i -  1][j - wt[i - 1]] + vala [i - 1]);
               }
            }
        }
        return dp[wt.length][val];
    }
}
