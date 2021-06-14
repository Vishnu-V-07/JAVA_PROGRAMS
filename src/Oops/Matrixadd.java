package Oops;
import java.util.*;
public class Matrixadd {

    public  void add(int arr[][],int arr2[][],int r1,int r2,int c1,int c2,int arr3[][])
    {
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr3[i][j]=arr[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
            
        }
        
        
    }
    public  void mul(int arr[][],int arr2[][],int r1,int r2,int c1,int c2,int arr4[][])
    {
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                for(int k=0;k<r1;k++)
                {
                    arr4[i][j]+=arr[i][k]*arr2[k][j];
                }
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
    
        
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Matrixadd m=new Matrixadd();
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        int arr3[][]=new int[r1][c1];
        int arr4[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        if(r1==r2 && c1==c2)
        {

         m.add(arr,arr2,r1,r2,c1,c2,arr3);
         System.out.println();
         m.mul(arr,arr2,r1,r2,c1,c2,arr4);
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}

// I/P:


// 2
// 2
// 2 2
// 2 2
// 2
// 2
// 2 2
// 2 2

// O/P:

// 4 4
// 4 4

// 8 8
// 8 8