// Given two numbers'x' and 'y'.write a program to printnumber of digits needed to be
//  flipped convert 'x' to 'y'
//   I/P:
//   7 10
//   0111  1010 =>  7=>8 4 2 1=>0 1 1 1 ; 10=>8 4 2 1=> 1 0 1 0

// 0 1 1 1 => 1  0  1 0                         change 3
// 1 0 1 0


//   O/P:
//   3
package Numbers;
import java.util.*;
public class Bitswap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String s1=Integer.toBinaryString(n1);
        String s2=Integer.toBinaryString(n2);
        while(s1.length()<s2.length())
        {
        if(s1.length()<s2.length())
        {
            s1="0"+s1;
        }
        else{
            s2="0"+s2;
        }
    }
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
            }
        }
        System.out.println(s1+" "+s2);
        System.out.println(count);
    }
}
