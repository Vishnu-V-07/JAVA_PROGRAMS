package Zoho_Interview_questions;


import java.util.*;
class whiteBlack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char W='W';
        char B='B';
        String s3="";
        int count=0;
        if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==W  && s2.charAt(i)==W)
                {
                    s3+="B";
                }
                else if(s1.charAt(i)==B  && s2.charAt(i)==B)
                {
                    s3+="W";
                }
                else if((s1.charAt(i)==W  && s2.charAt(i)==B) || (s1.charAt(i)==B  && s2.charAt(i)==W))
                {
                    if(count%2==0)
                    {
                        s3+=s1.charAt(i);
                        count++;
                    }
                    else{
                        s3+=s2.charAt(i);
                        count++;
                    }
                }

            }
            System.out.println(s3);
        }
    }
}

/*
INPUT:
WBWB
WBBB

OUTPUT:
BWWW


INPUT:
BBBW
BWBB

OUTPUT:
WBWB



INPUT:
WWWW
BBBB

OUTPUT:
WBWB



*/