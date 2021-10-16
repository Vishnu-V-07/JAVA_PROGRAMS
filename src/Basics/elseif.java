package Basics;
import java.util.*;
class elseif
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//5
        int b=sc.nextInt();//7
        int c=sc.nextInt();//2
        if(a>b && a>c)
        {
            System.out.println("A is greatest");
        }
        else if(b>a && b>c)//7>5 && 7>2
        {
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
    }
}

// 5
// 6
// 7
// C is greatest
