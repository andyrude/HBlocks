package Contest2853;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[ n];
        System.out.println(getMaxArea( arr, n));
    }

    private static int getMaxArea(int[] arr, int n) {
        int[] ls = new int[n];
        int[] rs = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

    }
}
