package Contest2853;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackusingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for ( int i = 0; i < n; i++){
            stack.push( sc.nextInt());
        }
        while ( !stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
