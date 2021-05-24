package Strings;
import java.util.*;
public class CheckConsecutiveCharacters
{
    public static void Check(String s1,String s2)
    {
        char prev=s1.charAt(0);
        int count=0;
        int flag=0;
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
        
            for(int j=0;j<s1.length();j++)
            {
                if(c==s1.charAt(j))
                {
                    for(int k=j;k>=0;k--)
                    {
                        if(prev==s1.charAt(k))
                        {
                            count++;
                        }
                    }
                    prev=c;
                   // System.out.println(prev);
                }
            }
           // System.out.println(count);
            if(count==s2.length())
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Check(s1,s2);
    }
}