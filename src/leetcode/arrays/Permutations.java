package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Permutations {

    static ArrayList<ArrayList<Integer>> arrayList;

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        getSol( arr);
    }

    private static void getSol(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        String str = "";
        for ( int i = 0; i < arr.length; i++){
            str = str + String.valueOf( arr[i]);
        }
        for ( int i = 0; i < arr.length; i++){
                String p = "";
                int[] arr3 = new int[arr.length];
                for ( int j = 0; j < arr.length; j++){
                    if ( j < arr.length - 1){
                        arr3[j + 1] = arr[ j];
                        p = p + String.valueOf( arr3[ j + 1]);
                    }
                    if( j == arr.length - 1){
                        arr3[0] = arr[arr.length];
                    }
                }
        }
    }
}
