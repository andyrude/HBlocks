package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombinationSum {

    static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    static ArrayList<String> arrayList2 = new ArrayList< >();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        int n = sc.nextInt();
        int k = 0;
        getSol( arr, n, k, "");
        System.out.println( arrayList);
    }

    private static void getSol(int[] arr, int target, int k, String str) {
        if ( target == 0){
                char[] arr2 = str.toCharArray();
                Arrays.sort(arr2);
                String m = "";
                for ( int i =0; i < arr2.length; i++){
                    m = m + arr2[i];
                }
                if ( arrayList2.contains(m) == false){
                    ArrayList<Integer> charList = new ArrayList<>();
                    for ( int i = 0; i < str.length(); i++){
                        charList.add( Integer.parseInt( String.valueOf(arr2[i])));
                    }
                    arrayList2.add(m);
                    arrayList.add(charList);
                }
                str = "";
                return;
        }
        if ( target < 0){
            return;
        }
        for( int i = 0; i < arr.length; i++){
            getSol( arr, target - arr[i], arr[i], str + String.valueOf(arr[i]));
        }
        return;
     }
}
