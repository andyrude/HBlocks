package Contest2853;

import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[ n];
        for ( int i = 0; i < n; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        System.out.println(maxRobbery( arr, n));
    }

    private static int maxRobbery(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[0] + arr[2];
        for ( int i = 3; i < n; i++){
            dp[i] = Math.max( dp[i - 2] + arr[i], dp[i - 3] + arr[i]);
        }
        return Math.max(dp[n-1], dp[n - 2]);
    }
}