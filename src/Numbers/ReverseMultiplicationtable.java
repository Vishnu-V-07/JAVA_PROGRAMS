package Numbers;
import java.util.*;
public class ReverseMultiplicationtable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=10;i>0;i--)
        {
            System.out.println(i+"x"+n+"="+i*n);
        }
    }
    
}
