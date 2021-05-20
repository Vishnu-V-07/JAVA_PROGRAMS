package Strings;
import java.util.*;
public class distanceString {
    public static void  Distance(String s1,String s2)
    {
        String s3="";
        int count=0;
        int k=0;
        if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    s3+=s2.charAt(i);
                    count++;
                }
                else{
                    s3+=s2.charAt(i);
                } 
              
            }
        }
        else if(s2.length()>s1.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    s3+=s2.charAt(i);
                    count++;
                }
                else{
                    s3+=s2.charAt(i);
                } 
                k=i;
            }
            for(int j=k+1;j<s2.length();j++)
            {
                s3+=s2.charAt(j);
                count++;

            }
        }
       // System.out.println(s3);
        System.out.println(count);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Distance(s1,s2);
    }
    
}
