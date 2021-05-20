package Numbers;
import java.util.*;
public class MixtureOfOddandEven {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int a=0;
        int b=0;
        if(iNum==1)
        {
            System.out.println(a);
    
        }
        if(iNum==2)
        {
            System.out.println(b);
        }
        int c=1;
        int d=1;
        for(int i=2;i<=iNum;i++)
        {
            if(i%2==0)
            {
                c*=2;
            }
            else{
                d+=1;
            }
        }
        if(iNum%2==0)
        {
            System.out.println(d);
        }
        else{
            System.out.println(c);
        }
    }
    
}
// 5
// 4