package TwoDArrays;
import java.util.*;
public class SpiralClockwise {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iR=sc.nextInt();
        int iC=sc.nextInt();
        int t=iR,t1=iC;
        int arr[][]=new int[iR][iC];
        for(int i=0;i<iR;i++)
        {
            for(int j=0;j<iC;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r=0,c=0;int prev=0,curr=0;
        while(r<iR && c<iC)
        {
            if(r+1==iR || c+1==iC)
               break;
            prev=arr[r+1][c];
            for(int i=c;i<iC;i++)
            {
                curr=arr[r][i];
                arr[r][i]=prev;
                prev=curr;
            }
            r++;
            for(int i=r;i<iR;i++)
            {
                curr=arr[i][iC-1];
                arr[i][iC-1]=prev;
                prev=curr;
            }
            iC--;
            for(int i=iC-1;i>=c;i--)
            {
                curr=arr[iR-1][i];
                arr[iR-1][i]=prev;
                prev=curr;
            }
            iR--;
            for(int i=iR-1;i>=r;i--)
            {
                curr=arr[i][c];
                arr[i][c]=prev;
                prev=curr;
            }
            c++;


        }
      
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<t1;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
