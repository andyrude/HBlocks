package JumpGame;

import java.util.Scanner;

public class JumpGameI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(toFindIfJumpPoss( arr));
    }

    private static boolean toFindIfJumpPoss(int[] arr) {
        int currIndex = arr.length - 1;
        for ( int i = arr.length - 1; i >= 0; i++){
            if( i + arr[i] >= currIndex ){
                currIndex = i;
            }
        }
        System.out.println(currIndex);
        if( currIndex == 0){
            return true;
        }
        return false;
    }
}
