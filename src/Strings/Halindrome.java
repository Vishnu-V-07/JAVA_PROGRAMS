package Strings;
import java.util.*;
public class Halindrome {
    public static boolean checkPalin(String s1)
    {
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        if(s1.equals(String.valueOf(sb)))
        {
            return true;
        }
        return false;
        
    }
    public static int checkHalindrome(String s1)
    {
        int count=0;
           if(s1.length()>2)
           {
                if(checkPalin(s1))
                {
                    count++;
                }
                else{
                    if(s1.length()%2==0)
                    {
                        int l=s1.length()/2;
                        String s2=s1.substring(0,l);
                        String s3=s1.substring(l,s1.length());
                        if(checkPalin(s2) &&  checkPalin(s3))
                        {
                            count++;
                        }
                    }
                    else
                    {
                        int l=s1.length()/2;
                        String s2=s1.substring(0,l-1);
                        String s3=s1.substring(l+1,s1.length());
                        if(checkPalin(s2) &&  checkPalin(s3))
                        {
                            count++;
                        }

                    }
                }
            

       }
      // System.out.println(count);
       return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iT=sc.nextInt();
        int sum=0;
        for(int i=0;i<iT;i++)
        {
            String s5=sc.next();
            sum+=checkHalindrome(s5);
        }
        System.out.println(sum);
    }
    
}

// I/P:

// 4
// hahshs
// occ
// as
// hah

// O/P:
// 3