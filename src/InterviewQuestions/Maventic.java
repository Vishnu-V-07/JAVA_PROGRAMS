package InterviewQuestions;
import java.util.*;
class Main
{
    public static boolean vowel(char a)
    {
        if(a=='a' || a=='i' || a=='e' || a=='o' || a=='u')
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int k=0;
        char m='@';
        for(int i=0;i<s1.length()-1;i++)
        {
            int n1=0,n2=0;
            for(int j=0;j<i;j++)
            {
                if(vowel(s1.charAt(i)))
                {
                    n1++;
                }
            }
            for(int j=i+1;j<s1.length();j++)
            {
                if(vowel(s1.charAt(j)))
                {
                    n2++;
                }
            }
            if(n1==n2 && n1!=0)
            {
                m=s1.charAt(i);
                k=1;
            }
        }
        if(k==1)
        {
            System.out.println(m);
        }
        else{
            System.out.println(s1.length()/2);
        }
    }
}