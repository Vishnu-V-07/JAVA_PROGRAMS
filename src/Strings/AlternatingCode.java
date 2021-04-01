package Strings;

import java.util.*;

public class AlternatingCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int flag = 0, dup = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s1.charAt(i + 2)) {
                flag++;
            } else {
                dup++;
            }
        }
        if (flag > 0 && dup == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
