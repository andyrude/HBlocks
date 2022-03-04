package leetcode.permutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StringPermutations {
    static ArrayList< String> arrayList = new ArrayList<>();

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
        getAllSubStrings( 0, str.length(), map, "");
        System.out.println( arrayList);
    }

    private static void getAllSubStrings(int cs, int len, HashMap< Character, Integer> map, String asf) {
        if ( cs == len){
            arrayList.add( asf);
            return;
        }
            for ( char ch: map.keySet()){
                if ( map.get(ch) > 0){
                    map.put( ch, map.get(ch) - 1);
                    getAllSubStrings( cs + 1, len, map, asf + ch);
                    map.put( ch, map.get( ch) + 1);
                }
            }
    }
}
