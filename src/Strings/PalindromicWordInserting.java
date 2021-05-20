package Strings;
import java.util.*;
public class PalindromicWordInserting {

    public static boolean checkPalindrome(String s2)
    {
        StringBuffer sb=new StringBuffer(s2);
        sb.reverse();
        if(s2.equals(String.valueOf(sb)))
        {
            return true;
        }
        return false;
    }

    public static void isPalindrome(String s1)
    {
        if(checkPalindrome(s1))
        {
            System.out.println(s1);
           
       }
       else{
            String s2="";
            for(int i=0;i<s1.length();i++)
            {
                if(i==0)
                {
                    s2=s1.charAt(i)+s1.substring(0,s1.length());
                    //System.out.println(s2);
                    if(checkPalindrome(s2))
                    {
                        System.out.println(s2);
                        break;
                    }
                }
                else{
                    s2=s1.charAt(i)+s2.substring(0,s2.length());
                   // System.out.println(s2);
                    if(checkPalindrome(s2))
                    {
                        System.out.println(s2);
                        break;
                    }
                }
            }
       }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        isPalindrome(s1);
    }
    
}
// race
// ecarrace