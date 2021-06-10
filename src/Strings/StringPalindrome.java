package Strings;
import java.util.*;
class StringPalindrome
{
    public static  boolean checkPalin(String s3)
    {
        StringBuffer sb=new StringBuffer(s3);
        sb.reverse();
        String s5=sb.toString();
        String s6="";
        if(!(s3.equals(s5)))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        String s2=sb.toString();
        String s3="";
        if(!(s1.equals(s2)))
        {
            System.out.println(s1);
        }
        else
        {
            for(int i=0;i<s1.length();)
            {
                //char c=s1.charAt(i);
                s3+=s1.substring(i+1,s1.length());
                if(checkPalin(s3))
                {
                    System.out.println(s3);
                    break;
                }
                else{
                    i++;
                }
            }
        }
    }
}