package leetcode.info;

import java.util.Scanner;

public class Problem3 {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        find( n, n, x, y, "");
        System.out.println( count);
    }

    private static void find(int l,int n, int x, int y, String s) {
        if ( x == 0 && y == 0){
            int ml = l - s.length() + 1;
            System.out.println( ml);
            System.out.println( Math.pow( 6, ml));
            count = count + (int) ( Math.pow( 6, ml));
            return;
        }
        if( n == 0){
            return;
        }
        find( l,n - 1, x , y - 1, s + "1");
        find( l,n - 1, x - 1 , y , s + "2");
        find( l,n - 1, x - 1, y - 1, s + "3");
        find( l,n - 1, x , y , s + "4");
        find( l,n - 1, x - 1 , y - 1, s + "5");
        find( l,n - 1, x , y - 1, s + "6");

    }
}
