package Basics;
import java.util.*;
class IncDec_Operators
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//5

        //Pre Increment
        int c=++a;//5+1=6;c=6,a=6

        System.out.println("c is "+c);//6
        System.out.println("a is "+a);//6

         //Post Increment
         int d=a++;//d=6;a++=a=a+1=6+1=7  d=6 a=7

         System.out.println("d is "+d);//6
         System.out.println("a is "+a);//7


         //Pre Decrement
        int e=--a;//a=a-1=>7-1=6  e=6;a=6

        System.out.println("e is "+e);//6
        System.out.println("a is "+a);//6

         //Post Decrement
         int f=a--;//f=6 a=a-1=6-1=5  f=6 a=5

         System.out.println("f is" +f);//6
         System.out.println("a is "+a);//5




    }
}


// c is 6
// a is 6
// d is 6
// a is 7
// e is 6
// a is 6
// f is6
// a is 5
