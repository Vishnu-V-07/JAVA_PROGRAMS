package Strings;
import java.util.*;
public class Encoding {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char c=s1.charAt(0);
        int count=1;
        for(int i=1;i<s1.length();i++)
        {
            if(c==s1.charAt(i))
            {
                count++;
            }
            else{
                System.out.print(count+""+c);
                count=1;
                c=s1.charAt(i);
            }
        }
        System.out.print(count+""+c);
    }
    
}

// AAAABBBCCDAA
// 4A3B2C1D2A