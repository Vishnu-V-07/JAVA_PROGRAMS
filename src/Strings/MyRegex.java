// rite a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

// IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
// In this problem you will be provided strings containing any combination 
// of ASCII characters. You have to write a regular expression to find the 
// valid IPs.

// Sample Input

// 000.12.12.034
// 121.234.12.12
// 23.45.12.56
// 00.12.123.123123.123
// 122.23
// Hello.IP
// Sample Output

// true
// true
// true
// false
// false
// false
package Strings;

import java.util.*;

class MyRegex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String sArr[] = s1.split("\\.");
        int count = 0, flag = 0, dup = 0;
        ;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isAlphabetic(s1.charAt(i))) {
                dup++;
            }
        }
        if (dup == 0) {
            for (int i = 0; i < sArr.length; i++) {
                String s2 = sArr[i];
                if (s2.length() <= 3) {
                    int a = Integer.parseInt(s2);
                    if (a >= 0 && a <= 255) {
                        count++;
                    } else {
                        flag++;
                    }
                } else {
                    flag++;
                }
            }
            if (count > 1 && flag == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");

        }
    }
}