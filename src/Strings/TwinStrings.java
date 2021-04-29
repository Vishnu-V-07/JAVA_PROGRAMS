package Strings;
import java.util.*;
public class TwinStrings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        String s[]= new String[iNum];
        for(int i=0;i<iNum;i++)
        {
            s[i]=sc.next();
        }
        int a=sc.nextInt();
        String s2[]=new String[a];
        for(int i=0;i<a;i++)
        {
            s2[i]=sc.next();
        }
        String s1="";
        String s3="";
        for(int i=0;i<s.length;i++)
        {
            s1=s[i];
            s3=s2[i];
            if(s1.length()==s3.length())
            {
          
                int j=0;
                while(j<s1.length()-2)
                {
                    if(j==0)
                    {
                    char c=s1.charAt(j);
                        s1=s1.charAt(j+2)+s1.substring(j+1,s1.length());
                        s1=s1.substring(0,j+2)+c+s1.substring(j+3,s1.length());
                        j++;
                    
                    }
                    else{
                        char c=s1.charAt(j);
                        s1=s1.substring(0,j)+s1.charAt(j+2)+s1.substring(j+1,s1.length());
                        s1=s1.substring(0,j+2)+c+s1.substring(j+3,s1.length());
                        j++;
                        

                    }
                }
           
                if(s1.equals(s2[i]))
                {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
                s1="";
            }
            else
            {
                System.out.println("No");
            }
                        
        }             
             
    }
          
}
      

