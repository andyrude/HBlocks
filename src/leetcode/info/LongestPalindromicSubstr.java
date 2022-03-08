package leetcode.info;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromicSubstr {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        getMaxLength( str);
    }

    private static void getMaxLength( String str) {
        int n = str.length();
        boolean[][] dp = new boolean[str.length()][str.length()];
        for ( int i = 0; i < n; i++){
            for ( int j = 0, g = i; g < str.length(); i++, j++){
                    if ( i == 0){
                        dp[j][g] = true;
                    }else if( i == 1 && str.charAt(i) == str.charAt(j)) {
                        dp[j][g] = true;
                    }else {
                        if( str.charAt( j) == str.charAt( g) && dp[ j + 1][g - 1] == true){
                            dp[j][g] = true;
                        }
                    }
            }
        }
        for ( int i = 0; i < str.length(); i++){
            System.out.println(Arrays.toString( dp[i]));
        }
    }
}
