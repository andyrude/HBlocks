package leetcode.arrays;

import java.util.Scanner;

public class ConvertingIntegerToBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        getIntegerToBits( n);
    }

    private static void getIntegerToBits(int n) {
        int[] binary = new int[35];
        int id = 0;

        while (n > 0) {
            int k = n % 2;
            binary[id++] = k;
            n = n / 2;
        }

        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }
}
