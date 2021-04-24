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
        
        if(s1.length()<s2.length())
        {
            s1="0"+s1;
        }
        else{
            s2="0"+s2;
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
