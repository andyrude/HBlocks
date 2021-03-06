package Contest2853;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int nCoins = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[nCoins];
        for ( int i = 0; i < nCoins; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getMaxWays( arr, nCoins, val));
    }

    private static int getMaxWays(int[] arr, int nCoins, int val) {
        int[][] arr2 = new int[nCoins + 1][val + 1];
        for (int i = 0; i <= nCoins; i++){
            for(int j=0; j <= val; j++){
                if( j == 0 || i==0 ){
                    arr2[i][j] = 0;
                }else if( j - arr[i-1] < 0){
                    arr2[i][j] = arr2[i-1][j];
                }else if(j - arr[i-1] == 0){
                    arr2[i][j] = arr2[i-1][j] + 1;
                }else{
                    arr2[i][j] = arr2[i][j-arr[i-1]] + arr2[i-1][j];
                }
            }
        }
        return arr2[nCoins ][val ];
    }
}
