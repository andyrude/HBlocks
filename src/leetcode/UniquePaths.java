package leetcode;

import java.io.IOException;
import java.util.Scanner;

public class UniquePaths {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        getTotalNumPaths( n, m, 0, 0);
        System.out.println( count);
    }

    private static void getTotalNumPaths(int n, int m, int i, int j) {
        if( i == n-1 || j == m - 1){
            count++;
            return;
        }
        if ( i < 0 || j < 0 || i >= m || j >= n){
            return;
        }
        getTotalNumPaths( n, m, i + 1, j);
        getTotalNumPaths( n, m, i, j + 1);
    }
}
