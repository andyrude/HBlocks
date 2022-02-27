package Contest2853;

import java.util.Arrays;
import java.util.Scanner;

public class GetLCS2Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(getLCS( 0, 0, str1, str2));
    }

    private static int getLCS(int i, int j, String str1, String str2) {
        int[][] dp = new int[str1.length()][str2.length()];
        if ( i == str1.length() || j == str2.length()){
            return 0;
        }
        if ( dp[i][j] != 0){
            return dp[i][j];
        }
        if ( str1.charAt(i) == str2.charAt(j)){
            dp[i][j] = getLCS( i + 1, j + 1, str1, str2) + 1;
        }else{
            dp[i][j] = Math.max( getLCS( i + 1, j, str1, str2), getLCS( i, j + 1, str1, str2));
        }
        return dp[i][j];
    }
}
