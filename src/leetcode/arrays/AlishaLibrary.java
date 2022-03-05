package leetcode.arrays;

import java.util.Scanner;

public class AlishaLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println( getBooks( n, m, k , s));
    }

    private static int getBooks(int n, int m, int k, int s) {
         //number of ways of picking science books
       int scb = 1;
       if ( k == s){
           scb = 1;
       }else {
           scb = fact( k)/( fact( k - s) * fact( s));
       }
       int chb = fact( m)/ (fact( m - 2) * 2);
       return scb * chb * n;
        }

    private static int fact(int n){
        int fact = 1;
        for ( int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println( fact);
        return fact;
    }
}
