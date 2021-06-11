package Numbers;
import java.util.*;

public class checksumoffactequalton {
    public static int fact(int a)
    {
        int b=1;
        for(int i=a;i>=1;i--)
        {
            b*=i;
        }
        return b;
    }

    public static void FactCheck(int iNum)
    {
       int sum=0;
       int temp=iNum;
       while(iNum>0)
       {
           int a=iNum%10;
           int b=fact(a);
           sum+=b;
           iNum/=10;

       }
       if(sum==temp)
       {
           System.out.println(temp);
       }
       else{
           System.out.println(-1);
       }
    }

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int iNum=sc.nextInt();
    FactCheck(iNum);
}
    
}

