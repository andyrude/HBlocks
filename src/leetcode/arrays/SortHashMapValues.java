package leetcode.arrays;

import java.util.*;

public class SortHashMapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        HashMap<  String, Integer> map = new HashMap<>();
        for ( int i = 0; i < n; i++){
            sc.nextLine();
            String str = sc.nextLine();
            int k = sc.nextInt();
            map.put( str, k);
        }
        System.out.println(map);
        sortTheHashMap( map);
    }

    private static void sortTheHashMap(HashMap<String, Integer> map) {
        ArrayList<Map.Entry< String, Integer>> list = new ArrayList< Map.Entry< String, Integer>>( map.entrySet());
        System.out.println( list);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        System.out.println( list);
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println( temp);

    }
}
