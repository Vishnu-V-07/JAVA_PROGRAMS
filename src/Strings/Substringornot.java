package Strings;
import java.util.*;
public class Substringornot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3="";
        int flag=0;
        for(int j=0;j<s1.length();j++)
        {
            if(s2.length()>j && s2.charAt(j)=='*')
            {
                s3+=s1.charAt(j);
                s2=s2.substring(0,j)+s1.charAt(j)+s2.substring(j+1,s1.length());
                System.out.println(s2);
                // if(s1.length()==s2.length())
                // {
                //     break;
                // }
                // System.out.println(s3);
             
            }
            else if(s2.length()>j){
                s3+=s2.charAt(j);
                System.out.println(s3);
                
            }
        }
      //  System.out.println(s3);
        if(s1.contains(s2))
        {
            System.out.println("True");
            
        
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
