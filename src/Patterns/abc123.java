package Patterns;
import java.util.*;
class abc123
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a='A';
        int b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                if(i%2==0)
                {
                    System.out.print(b+" ");
                    b++;
                }
                else{
                    System.out.print(a+" ");
                    a++;
                }
              
            }
            System.out.println();
        }
    }
}


// 5
// A B C D E
// 1 2 3 4
// F G H
// 5 6
// I