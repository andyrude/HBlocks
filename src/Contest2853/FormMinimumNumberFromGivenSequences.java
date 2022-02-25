package Contest2853;

import java.util.Scanner;
import java.util.Stack;

public class FormMinimumNumberFromGivenSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        for ( int i = 0; i < n; i++){
            System.out.println(getSeq(str[i]));
        }
    }

    private static String getSeq(String str) {
        int[] dp = new int[ str.length() + 1];
        int count = 1;
        for( int i = 0; i < str.length(); i++){
            if( i == str.length() - 1 || str.charAt(i) == 'I'){
                dp[i] = count;
                count++;
                int j = i - 1;
                while ( j >= 0 && str.charAt(j) == 'D'){
                    dp[j] = count;
                    count++;
                    j--;
                }
            }
        }
        String p = "";
        for ( int i = 0; i < str.length(); i++){
            p = p + String.valueOf(dp[i]);
        }
        return p;
    }
}
