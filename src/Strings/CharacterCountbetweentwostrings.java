// PROGRAM TO COUNT THE CHARACTER OF FIRST STRING PRESENT IN THE SECOND STRING
// I/P:aA
// O/P:aAAbbbb
package Strings;
import java.util.*;
public class CharacterCountbetweentwostrings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count=0;
        for(int i=0;i<s2.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)==s2.charAt(i))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
