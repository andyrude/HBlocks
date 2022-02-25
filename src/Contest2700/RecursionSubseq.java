package Contest2700;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> list = getSubseq(str);
        for (String str1: list){
            System.out.print(str1 + " ");
        }
    }

    private static ArrayList<String> getSubseq(String str) {
            if ( str.length() == 0){
                ArrayList<String> hh = new ArrayList<>();
                hh.add(" ");
                return hh;
            }

            char ch = str.charAt(0);
            String str1 = str.substring(1);
            ArrayList<String> list = getSubseq(str1);
            ArrayList<String> arrayList = new ArrayList<>();
        for (String rstr: list) {
            arrayList.add("" + rstr);
            arrayList.add(ch + rstr);
        }
        return arrayList;
    }
}
