package Strings;
import java.util.*;
public class MergeString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int i=0,j=0;
        while(i<s1.length() || j<s2.length())
        {
            if(i<s1.length())
            {
                System.out.print(s1.charAt(i));
                i++;
            }
            if(j<s2.length())
            {
                System.out.print(s2.charAt(j));
                j++;
            }
        }
    }
    
}
// Abc
// Def
// ADbecf