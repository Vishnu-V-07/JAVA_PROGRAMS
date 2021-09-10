package Numbers;
import java.util.*;
class NeonNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int temp=iNum;
        int sum=0;
        while(iNum>0)
        {
            int a=iNum%10;
            sum+=a;
            iNum/=10;
        }
        int sq=sum*sum;
        if(sq==temp)
        {
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}


// 81=>8+1=>9=>9*9==81
// Neon Number


// 75=>7+5=13=>13*13=169=>169!=75
// Not a Neon Number