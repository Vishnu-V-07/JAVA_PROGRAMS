package InterviewQuestions;
import java.util.*;
public class CollectingCandies {

    public static void TotalSeconds(int arr[],int iNum)
    {
        int sum=0;
        int seconds=0;
        for(int i=0;i<iNum;i++)
        {
            if(i>0)
            {
                sum+=arr[i];
                seconds+=sum;
            }
            else
            {
                sum+=arr[i];
            }
        }
        System.out.println(seconds);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iT=sc.nextInt();
        for(int i=0;i<iT;i++)
        {
            int iNum=sc.nextInt();
            int arr[]=new int[iNum];
            for(int j=0;j<iNum;j++)
            {
                arr[j]=sc.nextInt();
            }
            TotalSeconds(arr,iNum);
        }
    }
    
}
