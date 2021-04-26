// PRINT A LINE CONTAINING ALL THE DIVISORS IN INCREASING ORDER SEPERATED BY SPACE
// I/P: 
// 10
// 1 2 5 10
package Numbers;
import java.util.*;
public class divisors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
