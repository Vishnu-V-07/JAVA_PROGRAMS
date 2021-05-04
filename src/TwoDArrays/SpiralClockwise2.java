package TwoDArrays;
import java.util.*;
public class SpiralClockwise2 {
    public static void Clockwise(int arr[][],int r,int c)
    {
        int row=0;
        int col=0;
        int t1=r;
        int t2=c;
        int prev,curr=0;
        if(r!=c)
        {
            System.out.println("Row and coloumn should be equal");
        }
        else{
            while(row<r && col<c)
            {
                
                if(row+1==r || col+1==c)
                {
                    break;
                }
                prev=arr[row+1][col];
                for(int i=col;i<c;i++)
                {
                    curr=arr[row][i];
                    arr[row][i]=prev;
                    prev=curr;
                }
                row++;
                for(int i=row;i<r;i++)
                {
                    curr=arr[i][c-1];
                    arr[i][c-1]=prev;
                    prev=curr;
                }
                c--;
                for(int i=c-1;i>=col;i--)
                {
                    curr=arr[r-1][i];
                    arr[r-1][i]=prev;
                    prev=curr;
                }
                r--;
                for(int i=r-1;i>=row;i--)
                {
                    curr=arr[i][col];
                    arr[i][col]=prev;
                    prev=curr;
                }
                col++;

            }
            for(int i=0;i<t1;i++)
            {
                for(int j=0;j<t2;j++)
                {
                  System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Clockwise(arr,r,c);
    }
    
}
