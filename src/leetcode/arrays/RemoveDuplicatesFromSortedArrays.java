package leetcode.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        sol( arr);
    }

    private static void sol(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add( arr[0]);
        int n = 0;
        for ( int i = 1; i < arr.length; i++){
            if( arr[i - 1] == arr[i]){
                if ( arr[i] == arr[i-1]){
                    if ( i >= 2){
                        n++;
                    }else{
                        n++;
                        arrayList.add(arr[i]);
                    }
                } else if ( arr[i] != arr[i - 1]){
                    n = 0;
                    arrayList.add( arr[i]);
                }
            }
        }
        System.out.println( arrayList);
    }
}
