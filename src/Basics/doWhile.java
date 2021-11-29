package Basics;


/*

 Syntax
   do{

   }while(condition);
*/
import java.util.*;
public class doWhile {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,n=0;
        do{
            sum+=n;
            System.out.println("Enter a number");
            n=sc.nextInt();

        }while(n>=0);

        System.out.println("The total sum is "+sum);
    }
    
}

/*
Enter a number
5
Enter a number
10
Enter a number
-5

The total sum is 15
*/