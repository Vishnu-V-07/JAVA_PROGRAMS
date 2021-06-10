package Patterns;
import java.util.*;
public class righttriangle1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        for(int i=1;i<=iNum;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}

// 5
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
