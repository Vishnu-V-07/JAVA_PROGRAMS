package Basics;
import java.util.*;
public class ArithmeticOperators {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int quo=a/b;
        int rem=a%b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(quo);
        System.out.println(rem);
        
    }
    
}

//I/P
// 10
// 5

//O/P
// 15
// 5
// 50
// 2
// 0
