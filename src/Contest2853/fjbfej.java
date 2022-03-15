package Contest2853;

import java.util.Arrays;
import java.util.HashMap;

public class fjbfej {

    public static void main(String[] args) {
        int[] arr = { 0, 0,0,1, 0, 0,1, 1};
        sortarr( arr);
    }

    private static void sortarr(int[] arr) {
        HashMap< Integer, Integer> map  = new HashMap<>();
        for( int i = 0; i < arr.length; i++){
            if ( arr[i] == 0 && map.containsKey( arr[i])){
                int c = map.get( arr[i]);
                c++;
                map.replace( arr[i], c);
            }
            else if( arr[i] == 1 && map.containsKey( arr[i])){
                int c = map.get( arr[i]);
                c++;
                map.replace(arr[i], c);
            }
            else {
                map.put( arr[i], 1);
            }
        }
        int i = 0;
        for( i = 0; i < map.get(0); i++){
            arr[i] = 0;
        }
        for ( i = i; i < arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString( arr));
    }
}
