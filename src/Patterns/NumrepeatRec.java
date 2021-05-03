package Patterns;
import java.util.*;
public class NumrepeatRec {
    public static void RecPattern(int iNum)
    {
        int r=iNum+1;
        int arr[][]=new int[r][iNum];
        int k=1;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<iNum;j++)
            {
               
                if(j==iNum-2 && i!=0)
                {
                    arr[i][j]=k;
                    k++;
                    
                }
                else{
                    arr[i][j]=iNum;
                }
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<iNum;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        RecPattern(iNum);
    }
    
}
