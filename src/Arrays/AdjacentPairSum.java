package Arrays;
import java.util.*;
class AdjacentPairSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(iNum%2==0)
        {
            for(int i=0;i<iNum;i=i+2)
            {
                System.out.print((arr[i]+arr[i+1])+" ");
            }
        }
        else{
            for(int i=0;i<=iNum-3;i=i+2)
            {
                System.out.print((arr[i]+arr[i+1])+" ");
            }
        }
    }
}

// 6
// 1 2 3 4 5 6
// 3 7 11


// 5
// 1 2 3 4 5
// 3 7