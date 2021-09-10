package Strings;
import java.util.*;
public class Ajsnumornot {
    public static void AjsCheck(int iNum)
    {
        String s1=Integer.toString(iNum);
        int  a=Integer.parseInt(String.valueOf(s1.charAt(0)))+Integer.parseInt(String.valueOf(s1.charAt(1)));
        String s2=Integer.toString(a);

        String s3=s1.substring(2,s1.length());
  
        if(s2.contains(s3))
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        AjsCheck(iNum);
    }
    
}

// I/P:

// 1. 9817

// 2. 1245

// O/P:

// 1. 1

// 2. 0