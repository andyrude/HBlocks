package leetcode.permutations;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutationWithoutHashMap {
    static ArrayList< String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str1 = sc.nextLine();
        String[] str = str1.split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        int[] newC = new int[str.length];
        getPermutation( str, 0, newC);
    }

    private static void getPermutation(String[] str, int i, int[] newC) {

    }
}
