package TwoDArrays;
import java.util.*;
public class IpatternSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iR=sc.nextInt();
        int iC=sc.nextInt();
        
        int arr[][]=new int[iR][iC];
        for(int i=0;i<iR;i++)
        {
            for(int j=0;j<iC;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int max=-30;
        for(int i=0;i<4;i++)
        {
            sum=0;
            for(int j=0;j<4;j++)
            {
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum+=arr[i+1][j+1];
                sum+=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            if(sum>max)
            {
                max=sum;
            }
            }
         
        }
         System.out.println(max);
    }
    
}
