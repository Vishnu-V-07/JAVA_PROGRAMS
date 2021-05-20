package Numbers;
import java.util.*;
public class GeometricSeries {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int a=1;
        int b=1;
        if(iNum==1)
        {
            System.out.println(iNum);
        }
        if(iNum==2)
        {
            System.out.println(1);
        }
        for(int i=2;i<=iNum;i++)
        {
           if(i%2==0)
           {
             a*=2;
           }
           else{
               b*=3;
           }
        }
        if(iNum%2==0)
        {
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
    
}

// 11
// 32