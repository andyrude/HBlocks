package leetcode.arrays;

import java.util.Scanner;

public class SubsetsII {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        String k = "";
        for ( int i = 0; i < str.length; i++){
            k = k + str[i];
        }
        sol( k, 0);
    }

    private static void sol(String k, int i) {
        return;
    }
}
