package Basics;



/*Syntax
for(initial expression;condition;update expression)
{

}
*/

//PROGRAM TO PRINT THE NUMBERS FROM 1 TO N:

import java.util.*;
public class forloop {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}

//I/p:
// 5

//O/P:
// 1
// 2
// 3
// 4
// 5


