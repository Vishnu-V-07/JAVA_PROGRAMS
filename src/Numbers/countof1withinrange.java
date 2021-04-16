// COUNT SET BITS IN A RANGE 
  
// Given a non negaative number n and have two values i and the problem is to count the numbersof set bits 
// in the rangel to r  in the binary representation of n ,i.e to count the set bits from rightmost lth bit 
// to the rightmost rth bit

// i/p:68
//     2 5

// o/p:1

package Numbers;
import java.util.*;
public class countof1withinrange {
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int l=sc.nextInt();
        int h=sc.nextInt();
        String s1=Integer.toBinaryString(iNum);
        int count=0;
        for(int i=l;i<h;i++)
        {
            if(s1.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
