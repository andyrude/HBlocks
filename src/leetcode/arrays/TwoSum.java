package leetcode.arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        int target = sc.nextInt();
        sol( arr, target);
    }

    private static void sol(int[] arr, int target) {
        for ( int i = 0; i < arr.length - 1; i++){
            for ( int j = i + 1; j < arr.length; j++){
                if ( arr[i] + arr[j] == target){
                    System.out.println("[" + i + "," + j + "]");
                    break;
                }
            }
        }
    }
}
