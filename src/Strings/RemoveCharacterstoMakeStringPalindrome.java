package Strings;
import java.util.*;
public class RemoveCharacterstoMakeStringPalindrome {

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

    public static void toPalin(String s1,int k)
    {
        int count=0;
        ArrayList<Character> al=new ArrayList<>();
        for(int j=0;j<s1.length();j++)
        {
            count=0;
            char d=s1.charAt(j);
            for(int l=0;l<s1.length();l++)
            {
                if(d==s1.charAt(l))
                {
                    count++;
                }
            }
            if(count==1)
            {
                al.add(s1.charAt(j));
            }
        }
        System.out.println(al);
        String s2="";
        for(int j=0;j<al.size();j++)
        {
            char c=al.get(j);
            
            for(int i=0;i<s1.length();i++)
            {
                if(c==s1.charAt(i))
                {
                    continue;
                }
                else{
                    s2+=s1.charAt(i);
                }
            }
            
            s1=s2;
            s2="";

        }
        if(checkPalin(s1))
        {
            System.out.println(s1);
        }
        
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int k=sc.nextInt();
        toPalin(s1,k);
    }
    
}

// I/P:

// waterrfetawx
// 2

// O/P:

// waterretaw
