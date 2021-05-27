package Arrays;
import java.util.*;
public class SumOfOddelements {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        int sum=0;
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}

// 10
// 1 2 3 4 5 6 7 8 9 10
// 25