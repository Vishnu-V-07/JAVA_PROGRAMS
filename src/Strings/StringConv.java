// YODA

// 1.Description: As a young jedi you must learn to converse with Yoda. You have found a simple rule that helps change a “normal” sentence into “Yoda talk”. Take the first two words in the sentence and place them at the end. Write a program that uses this rule to change normal sentence into “Yoda talk”.

// eg: I/p: I am student of siet

// O/p: student of siet I am

package Strings;
import java.util.*;
class StringConv {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String arr[] = s1.split(" ");
        for (int i = 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[0] + " " + arr[1]);
    }
}