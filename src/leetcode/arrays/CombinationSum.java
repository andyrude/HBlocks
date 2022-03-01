package leetcode.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        int target = sc.nextInt();
        sol( arr, target);
    }

    private static void sol(int[] arr, int target) {
        ArrayList< ArrayList<Integer>> arrayList = new ArrayList<>();
        int[] targInt = new int[ target];
        for ( int i = 0; i < arr.length; i++){

        }

    }
}
