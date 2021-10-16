package Numbers;
import java.util.*;
public class OddPositionsSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Integer.parseInt(String.valueOf(s1.charAt(i)))%2!=0)
            {
                sum+=Integer.parseInt(String.valueOf(s1.charAt(i)));
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
    
}
