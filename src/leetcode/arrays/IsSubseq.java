package leetcode.arrays;

import java.util.Scanner;

public class IsSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println( check( str1, str2));
    }

    private static boolean check(String str1, String str2) {
        int i = 0;
        int j = 0;
        while ( i != str1.length() && j != str2.length()){
            if ( str1.charAt( i) == str2.charAt(j)){
                j++;
            }
            i++;
        }
        if ( j == str2.length()){
            return true;
        }
        return false;
    }
}
