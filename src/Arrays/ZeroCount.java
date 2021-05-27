package Arrays;
import java.util.*;
public class ZeroCount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<iNum;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}

// 5
// 1 1 1 0 0
// 2