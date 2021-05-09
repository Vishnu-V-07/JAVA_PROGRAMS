// SUM OF ELEMENTS IN A ARRAYLIST
// Sample Input

// 6
// 1 2 3 4 10 11
// Sample Output

// 31
package Arrays;
import java.util.*;

class SumofElements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        int sum=0;
        for(int i:al)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}