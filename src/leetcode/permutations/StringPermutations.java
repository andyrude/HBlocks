package leetcode.permutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        HashMap< Character, Integer> map = new HashMap<>();
        for (char ch: str.toCharArray()) {
            if ( map.containsKey(ch)){
                map.put( ch, map.get(ch) + 1);
            }else {
                map.put( ch, 1);
            }
        }
        getAllSubStrings( str);
    }

    private static void getAllSubStrings(String str) {
        ArrayList<String> arr = new ArrayList<>();
    }
}
