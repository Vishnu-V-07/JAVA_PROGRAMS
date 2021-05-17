package Collections;
import java.util.*;
public class FindingPairs {
    public static void toFindPair(int iNum,int arr[],int k)
    {
        int sum=0,flag=1;
        for(int i=0;i<iNum;i++)
        {
            sum=0;
            for(int j=0;j<iNum-1;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==k)
                {
                    System.out.println("Yes");
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("No");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        toFindPair(iNum,arr,k);
    }
    
}

// I/P:
// 4 4
// 1 2 3 4

// O/P:
// Yes