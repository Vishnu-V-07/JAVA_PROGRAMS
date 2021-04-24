// Given two numbers'x' and 'y'.write a program to printnumber of digits needed to be
 //flipped convert 'x/' to 'y'
 //  I/P:
//   7 10
//   O/P:
//   3
package Strings;
import java.util.*;
public class Password {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int count=0,d=0,sp=0,u=0,l=0;
        if(s1.length()<8)
        {
            System.out.println("Not Strong");
        }
        else
        {
            for(int i=0;i<s1.length();i++)
            {
                int c=s1.charAt(i);
                if(Character.isDigit(c))
                {
                    d++;
                }
                else if(Character.isLetter(c))
                {
                    if(c>=65 && c<=90)
                    {
                        u++;
                    }
                    else if(c>=97 && c<=122)
                    {
                        l++;
                    }
                }
                else{
                    sp++;
                }
            }
            if(d>=1 && sp>=1 && u>=1 && l>=1)
            {
                System.out.print("Strong Password");
            }
            else{
                System.out.print("Not Strong");
            }
        }
        
    }
}
