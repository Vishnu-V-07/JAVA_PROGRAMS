package InterviewQuestions;


import java.util.*;
public class ContinousSequence {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        String s1=sc.next();
        String s2="";
        int count=0;
        for(int i=0;i<s1.length()-1;i++)
        {
            s2="";
            char c1=s1.charAt(i);
            char c4=c1;
            if(Character.isLowerCase(c1))
            {
                c1=Character.toUpperCase(c1);
                
                
            }
            char c3=c1;
          
            c1++;
            char c2=c1;
            if(c2==s1.charAt(i+1))
            {
                if(!s2.contains(String.valueOf(c3)))
                {
                    String s3=String.valueOf(c3)+String.valueOf(c2);
                    s2+=s3;
                    
                }
                else{
                    String s3=String.valueOf(c2);
                    s2+=s3;
                }
                System.out.println(s2);
                i++;
                
            }
            else{
                if(Character.isLowerCase(c4))
                {
                    c3=Character.toLowerCase(c3);
                   
                }
                s2+=String.valueOf(c3);
                System.out.println(s2);
            }
            
        }
    }
    
}

/*
INPUT:
5
ABwRS

OUTPUT:
AB
w
RS


*/