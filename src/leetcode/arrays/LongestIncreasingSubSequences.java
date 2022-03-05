package leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LongestIncreasingSubSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[ n];
        for( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        getLongestSubseq( arr, n);
    }

    private static void getLongestSubseq(int[] arr, int n) {
        int[] lis = new int[ n];

        Arrays.fill( lis, 1);
        int max = 1;
        for ( int i = 1; i < n; i++){
            for( int j = 0; j < i; j++){
                if ( arr[ j] < arr[i] && lis[ j] + 1 > lis[i]){
                    lis[i] = lis[j] + 1;
                }
            }
            max = max > lis[i]? max: lis[i];
        }
        System.out.println(max);
    }
}
