package leetcode.info;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int  i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println( getTotalStrings( arr));
    }

    private static int getTotalStrings(int[] arr) {
        int k = 0;
        int s = 0;
        for ( int i = 1; i < arr.length; i++){
            if ( arr[i - 1] == 3 && arr[i] == 3){
                k++;
            }
            if( arr[ i - 1] == 2 && arr[i] == 2){
                s++;
            }
        }
        System.out.println( k);
        System.out.println( s);
        if( k > 0 && s > 0){
            return   k * s + 1;
        }
        if( k > 0 ){
            return k + 1;
        }
       else {
            return  s + 1;
        }
    }


}
