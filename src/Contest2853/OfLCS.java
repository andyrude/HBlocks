package Contest2853;

import java.util.Arrays;
import java.util.Scanner;

public class OfLCS {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[][] dp = new int[str1.length()][str2.length()];
        for ( int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        getNoLCS( dp, str1, str2, 0, 0);
        System.out.println(count);
    }

    private static int getNoLCS(int[][] dp, String str1, String str2, int i, int j) {
        if( j == str2.length() && i == str1.length()){
            count++;
        }if (i == str1.length() || j == str2.length()){
            return 0;
        }
        if ( dp[i][j] != -1){
            return dp[i][j];
        }
        if (str1.charAt(i) == str2.charAt(j)){
            getNoLCS( dp, str1, str2, i + 1, j + 1);
            getNoLCS( dp, str1, str2, i + 1, j);
        }else {
            getNoLCS( dp, str1, str2,i + 1, j);
        }
        return dp[0][0];
    }
}
