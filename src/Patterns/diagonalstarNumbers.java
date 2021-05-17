package Patterns;
import java.util.*;
public class diagonalstarNumbers {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int k=iNum;
        for(int i=iNum;i>=1;i--)
        {
            for(int j=1;j<=iNum;j++)
            {
                if(j==i)
                {
                    System.out.print("*");
                    k--;
                }
                else{
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
            k=iNum;
        }
    }
    
}
