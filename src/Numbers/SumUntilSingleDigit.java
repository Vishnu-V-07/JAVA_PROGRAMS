// PROGRAM TO DO FOLLOWING OPERATION:
// EXPLANATION:
// N=5347=5+3+4+7
// ITS SUM=19
// AGAIN SUM OF 1+9 IS 10
// AGAIN SUM OF 1+0=1
// NOW 1 IS A SINGLE DIGIT DIGIT SO ITS PRINT 1 AS OUTPUT

// I/P:5347
// O/P:1

package Numbers;
import java.util.*;
public class SumUntilSingleDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int sum=10;
        int temp=iNum;
        int b=0;
        while(sum>=10)
        {
           sum=0;
            while(iNum>0)
            {
                b=iNum%10;
                sum+=b;
               // System.out.println(sum);
                iNum/=10;
            }
           iNum=sum;
           
        
           
        }
        System.out.print(sum);
    }
    
}
