package Basics;

/*Syntax
 while(condition)
 {

 }
*/

import java.util.*;

public class While {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (a > 0)
         {
            int b = a % 10;
            sum += b;
            a /= 10;

        }
        System.out.println(sum);
    }
}

/*
I/P:

523

O/P:
10

*/