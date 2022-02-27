package JumpGame;

import java.util.Arrays;
import java.util.Scanner;

public class JumpGameII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(getMinJumps( arr));
    }

    private static int getMinJumps(int[] intArr) {
        int n = intArr.length;
        int[] dp = new int[intArr.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;
        for( int i = n - 2; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            for ( int j = i + 1; j <= Math.min( n - 1, i + intArr[i]); j++){
                min = Math.min( min, dp[j]);
            }
            if( min != Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}
