package leetcode.info;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class UsingIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        HashMap<String , Integer> hashMap = new HashMap<>();
        for ( int i = 0; i < n; i++){
            sc.nextLine();
            String str = sc.nextLine();
            int t = sc.nextInt();
            hashMap.put( str, t);
        }
        iterateAndDisplay( hashMap);
    }

    private static void iterateAndDisplay(HashMap<String, Integer> hashMap) {

        Iterator iterator = hashMap.entrySet().iterator();

        while ( iterator.hasNext()){
            Map.Entry mapEle = (Map.Entry)iterator.next();
            System.out.println( mapEle.getKey() + " "  + mapEle.getValue());
        }
    }
}
