package TwoDArrays;
import java.util.*;
public class Spiral2 {
    public static void Spiral(int arr[][],int r,int c)
    {
        int row=0,col=0;
        while(row<r && col<c)
        {
            for(int i=col;i<c;i++)
            {
                System.out.print(arr[row][i]+" ");
            }
            row++;
            for(int j=row;j<r;j++)
            {
                System.out.print(arr[j][c-1]+" ");
            }
            c--;
            for(int j=c-1;j>=col;j--)
            {
                System.out.print(arr[r-1][j]+" ");
            }
            r--;
            for(int j=r-1;j>=row;j--)
            {
                System.out.print(arr[j][col]+" ");
            }
            col++;


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
            for(int j=0;j<c;j++ )
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Spiral(arr,r,c);
    }
    
}
