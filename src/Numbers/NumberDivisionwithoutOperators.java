package Numbers;
import java.util.*;
public class NumberDivisionwithoutOperators {
    public static void Divide(int a,int b)
    {
        int c=0;
        int d=0;
        while(a>=b)
        {
            c=a-b;
            d++;
            a=c;

        }
        System.out.println(d);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Divide(a,b);
    }
    
}

//64
//8

//8