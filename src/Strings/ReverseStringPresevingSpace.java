package Strings;
import java.util.*;
public class ReverseStringPresevingSpace {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s3="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
            {
                s3+=String.valueOf(s1.charAt(i));
            }
        }
        String sarr[]=s1.split(" ");
        int k=s3.length()-1;
        for(int i=0;i<sarr.length;i++)
        {
            String s2=sarr[i];
            for(int j=0;j<s2.length();j++)
            {
                System.out.print(s3.charAt(k));
                k--;
            }
            System.out.print(" ");
        }

    }
    
}
// I am Not a String
// g ni rtS a toNmaI