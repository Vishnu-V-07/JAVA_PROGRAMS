package Basics;
import java.util.*;
public class InputFromUser {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String h=sc.nextLine();
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a number which accepts upto 6 decimal digits");
        float b=sc.nextFloat();
        System.out.println("Enter a number which accepts upto 15 decimal digits");
        double c=sc.nextDouble();
        System.out.println("Enter a byte");
        byte d=sc.nextByte();
        System.out.println("Enter a boolean");
        boolean e=sc.nextBoolean();
        System.out.println("Enter a word");
        String f=sc.next();//hi
        System.out.println("Enter a single character");
        char g=sc.next().charAt(0);
        System.out.println(h);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        
    }
    
}

// I/P:

// Enter a sentence
// hi hello everyone
// Enter a number
// 5
// Enter a number which accepts upto 6 decimal digits
// 12.333333
// Enter a number which accepts upto 15 decimal digits
// 11.22222222222222
// Enter a byte
// 100
// Enter a boolean
// true
// Enter a word
// hi
// Enter a single character
// h

// O/P:


// hi hello everyone
// 5
// 12.333333
// 11.22222222222222
// 100
// true
// hi
// h