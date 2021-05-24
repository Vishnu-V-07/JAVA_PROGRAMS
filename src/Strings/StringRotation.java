package Strings;
import java.util.*;
public class StringRotation {
    public static void Shift(String s1,int iNum)
    {
        String temp=s1;
        String s3="";
        String s4="";
        s3=s1.substring(iNum,s1.length())+s1.substring(0,iNum);
        System.out.println(s3);
        s4=s1.substring(s1.length()-iNum)+s1.substring(0,s1.length()-iNum);
        System.out.println(s4);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int iNum=sc.nextInt();
        Shift(s1,iNum);
    }
    
}

// vishnu
// 2

// shnuvi
// nuvish
