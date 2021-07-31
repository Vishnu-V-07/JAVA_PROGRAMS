package Patterns;
import java.util.*;
public class HarryPattern {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        for(int i=0;i<s1.length();i++)
        {
            for(int j=s1.length()-1;j>=i;j--)
            {
                System.out.print(s1.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    
}


// HARRY
// Y R R A H
// Y R R A
// Y R R
// Y R
// Y