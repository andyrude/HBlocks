package leetcode.arrays;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        System.out.println( checkValPara( str));
    }

    private static boolean checkValPara(String str) {
        Stack<Character> stack = new Stack<>();
        int i ;
        for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                    stack.push(str.charAt(i));
                } else if ((str.charAt(i) == ')' && stack.peek() == '(') || (str.charAt(i) == '}' && stack.peek() == '{') || (str.charAt(i) == ']' && stack.peek() == '[')) {
                    stack.pop();
                    continue;
                }
            }
        if ( i == str.length() && stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
