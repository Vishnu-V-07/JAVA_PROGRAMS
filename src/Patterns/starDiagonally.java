// JAVA PROGRAM TO PRINT * DIAGONALLY  
// I/P:5
// O/P:
//  *
//   *
//    *
//     *
//      *

package Patterns;
import java.util.*;
public class starDiagonally {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
                if(i==j)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
