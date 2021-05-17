package Patterns;
import java.util.*;
public class Pyramid {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
      for(int i=1;i<=iNum;i++)
      {
        for(int j=iNum;j>i;j--)
        {
            System.out.print(" ");
        }
        
        int k=i;
        for(int j=1;j<=i;j++)
        {
            System.out.print(k);
            k++;
        }
        k--;
        for(int j=1;j<i;j++)
        {
                k--;
                System.out.print(k);
        }
        System.out.println();
    }
    }
}
// 5
//     1
//    232
//   34543
//  4567654
// 567898765
