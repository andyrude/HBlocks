package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[ n];
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        getNumberOfUniqueEle( arr);
    }

    private static void getNumberOfUniqueEle(int[] arr) {
        HashMap< Integer, Integer> map = new HashMap<>();
        for( int i = 0; i < arr.length; i++){
            if ( map.containsKey( arr[i])){
                map.put( arr[i], map.get( arr[i]) + 1);
            }else {
                map.put( arr[i], 1);
            }
        }

        map.remove("");
        int n = 0;
        ArrayList<Integer> arrayList = new ArrayList<>( map.keySet());
        for (Integer i: arrayList) {
            if ( map.get(i) == 1){
                n++;
            }
        }
        System.out.println( n);
    }
}
