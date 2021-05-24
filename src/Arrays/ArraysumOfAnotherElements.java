package Arrays;
import java.util.*;
public class ArraysumOfAnotherElements
{
    public static void ReOrder(int iNum,int arr[])
    {
        int sum=0;
        for(int i=0;i<iNum;i++)
        {
            sum=0;//0
            for(int j=i+1;j<iNum;j++)//j=2 30
            {
                sum+=arr[j]; //30     
            }
            arr[i]=sum;//140
        }
        for(int i=0;i<iNum;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        ReOrder(iNum,arr);
    }
}