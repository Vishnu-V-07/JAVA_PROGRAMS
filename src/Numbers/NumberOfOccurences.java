package Numbers;
import java.util.*;
public class NumberOfOccurences {

    public static void CountofN(int iL,int iR,int iN)
    {
        int count=0;
        for(int i=iL;i<=iR;i++)
        {
            int a=i;
            while(a>0)
            {
             
               if(a==iN)
               {
                    count++;
               }
               a/=10;
               
            }
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iL=sc.nextInt();
        int iR=sc.nextInt();
        int iN=sc.nextInt();
        CountofN(iL,iR,iN);

    }
    
}

// I/P:
// 10 130 11

// O/P:
// 11