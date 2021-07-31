package Patterns;
import java.util.*;
class Fourteen16{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        int a=2;
        for(int i=1;i<=iNum;i++)
        {
            for(int j=iNum;j>=i;j--)
            {
                al.add(a);
                a+=2;
            }
        }
        int b=al.size()-iNum;
       // System.out.println(al);
        for(int i=iNum;i>=1;i--)
        {
            int k=b;
            for(int j=1;j<=i;j++)
            {
                System.out.print(al.get(b)+" ");
                b++;
            }
            System.out.println();
            
            b=k-i-1+2;
        }
        
    }
}


// 4
// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
// 14 16 18 20
// 8 10 12
// 4 6
// 2


// 4
// 14 16 18 20
// 8 10 12
// 4 6
// 2