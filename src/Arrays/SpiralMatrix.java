// SPIRAL MATRIX PROBLEM IN JAVA

// 4 4

// 1   2   3   4

// 5   6   7   8

// 9 10  11  12

// 13 14 15 16

// O/P:

// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


package Arrays;
import java.util.*;
public class SpiralMatrix {
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
    int row=0;
    int col=0;
    while(row<iR && col<iC)
    {
        for(int i=col;i<iC;i++)
        {
            System.out.print(arr[row][i]+" ");
        }
        row++;
        for(int i=row;i<iR;i++)
        {
            System.out.print(arr[i][iC-1]+" ");
        }
        iC--;
        for(int i=iC-1;i>=col;i--)
        {
            System.out.print(arr[iR-1][i]+" ");
        }
        iR--;
        for(int i=iR-1;i>=row;i--)
        {
            System.out.print(arr[i][col]+" ");
        }
        col++;

    }
    
    
}
}
