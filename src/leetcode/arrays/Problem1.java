package leetcode.arrays;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[ str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        toFindTheCost( arr, arr.length);
    }

    private static void toFindTheCost(int[] arr, int length) {
        int cost = 1;
        int n = 0;
        for ( int i  = 1; i < arr.length; i++){
            if ( arr[i - 1] == arr[i]){
                if ( n == 0){
                    n++;
                    cost = cost - 1;
                }else if( n >= 1){
                    n++;
                }
            }else {
                cost = cost + 1;
                n = 0;
            }
        }
        System.out.println( cost);
    }
}
