package Numbers;
import java.util.*;
public class ClimbStepsCount {

    public static void noOfWays(int iNum)
    {
        int a=1;
        int b=1;
        int c=0;
        if(iNum==1 || iNum==2)
        {
            System.out.println(a);
        }
        for(int i=2;i<=iNum;i++)
        {
             c=a+b;
             a=b;
             b=c;
            
        }
        System.out.println(c);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        noOfWays(iNum);
    }
    
}
// 5
// 8