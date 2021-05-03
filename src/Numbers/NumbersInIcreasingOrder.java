// Given a number as an input,find  the largest 
// number which is less than the given number and it should be in increasing order.
// I/P:
// 998
// O/P:
// 789
package Numbers;
import java.util.*;
public class NumbersInIcreasingOrder {
    public static void Increase(int iNum)
    {
        TreeSet<Integer> al=new TreeSet();
        int dup=iNum;
        String s1=String.valueOf(dup);
        while(dup>0)
        {
            int t=dup%10;
            al.add(t);
            dup/=10;
        }
       
        int i=1;
      
         while(al.size()!=s1.length())
         {
            int b=al.first()-i;
            
             al.add(b);
         
             i++;

              
        }
        for(int j:al)
        {
            System.out.print(j);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        Increase(iNum);
        sc.close();
    }
    
}
