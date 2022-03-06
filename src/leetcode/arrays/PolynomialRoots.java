package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PolynomialRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[ n + 1];
        arr[ 0] = n;
        for ( int  i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int[] newarr = new int[ n + 1];
        for ( int i = 0; i <= n; i++){
            newarr[ n - i] = arr[i];
        }
        int[] derivArr = new int[ n];
        for ( int i = 1; i <= n; i++){
            derivArr[i - 1] = i* newarr[i];
        }
        System.out.println( Arrays.toString( newarr));
        System.out.println( Arrays.toString( derivArr));
        int rem = newarr[0]/ derivArr[ 0];
        System.out.println( rem);
    }
}