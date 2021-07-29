package Strings;
import java.util.*;
public class a1b2withoutinbuilt {
     public static void toFind(String s1)
     {
         int flag=0;
         String s3="";
         for(int i=0;i<s1.length()-1;)
         {
             if((s1.charAt(i)>=48 && s1.charAt(i)<=57)&& !(s1.charAt(i+1)>=48 && s1.charAt(i+1)<=57) )
             {
                 int n=Integer.parseInt(String.valueOf(s1.charAt(i)));
                 for(int j=0;j<n;j++)
                 {
                    System.out.print(s1.charAt(i-1)+" ");
                   
                 }
                 i++;
             }
             else if((s1.charAt(i)>=48 && s1.charAt(i)<=57)&& (s1.charAt(i+1)>=48 && s1.charAt(i+1)<=57))
             {
                 String s2=String.valueOf(s1.charAt(i))+String.valueOf(s1.charAt(i+1));
                int n=Integer.parseInt(s2);
                for(int j=0;j<n;j++)
                {
                   System.out.print(s1.charAt(i-1)+" ");
                }
                i=i+2;
                
             }
             if(i==s1.length()-2)
             {
             
                if((s1.charAt(s1.length()-1)>=48 && s1.charAt(s1.length()-1)<=57) && (s1.charAt(s1.length()-2)>='a' && s1.charAt(s1.length()-2)<='z'))
                {
                    int n=Integer.parseInt(String.valueOf(s1.charAt(s1.length()-1)));
                    for(int j=0;j<n;j++)
                    {
                    System.out.print(s1.charAt(s1.length()-2)+" ");
                    }
                }
            }
             i++;
             

         }
        
     }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        toFind(s1);
    }
    
}


// a1b2c3


// a b b c c c