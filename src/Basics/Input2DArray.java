package Basics;
import java.util.*;
class Input2DArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();//2
        int col=sc.nextInt();//2
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        
    }
}


/* ij
   00 01 == 1  2
   10 11    3  4


   00 01 02      1  2  3
   10 11 12  ==  4  5  7
   20 21 22      8  9  10


I/P:

2 2

1 2
3 4

O/P:
1
2
3
4

   */
