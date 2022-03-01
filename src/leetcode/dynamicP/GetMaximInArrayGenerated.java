package leetcode.dynamicP;

import java.util.Arrays;
import java.util.Scanner;

public class GetMaximInArrayGenerated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getMaximInArr( n));
    }

    private static int getMaximInArr(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        if( n == 0){
            return 0;
        }else if( n == 1){
            return 1;
        }else {
            for ( int i = 2; i <= n/2; i++){
                if( i % 2 == 0){
                    arr[ 2 * i] = arr[i];
                }else if( i % 2 == 1){
                    arr[ 2 * i + 1] = arr[i] + arr[ i + 1];
                }
            }
        }
        System.out.println(Arrays.toString( arr));
        return 0;
    }
}
