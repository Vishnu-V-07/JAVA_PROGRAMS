// PRINT NUMBER N'S TABLE IN REVERSE ORDER. 
// I/P:
// 10

// O/P:
// 10x10=100
// 9x10=90
// 8x10=80
// 7x10=70
// 6x10=60
// 5x10=50
// 4x10=40
// 3x10=30
// 2x10=20
// 1x10=10

package Numbers;
import java.util.*;
public class ReverseMultiplicationtable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=10;i>0;i--)
        {
            System.out.println(i+"x"+n+"="+i*n);
        }
    }
    
}
