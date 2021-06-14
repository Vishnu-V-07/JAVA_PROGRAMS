package TwoDArrays;
import java.util.*;
public class EntireRowColtoZero {

    public static void changeRowCol(int arr[][],int iR,int iC)
    {
        int arr2[][]=new int[iR][iC];
        for(int i=0;i<iR;i++)
        {
            for(int j=0;j<iC;j++)
            {
                arr2[i][j]=arr[i][j];
            }
           
        }

        for(int i=0;i<iR;i++)
        {
            for(int j=0;j<iC;j++)
            {
                if(arr[i][j]==0)
                {
                    for(int k=0;k<iR;k++)
                    {
        
                        for(int l=0;l<iC;l++)
                        {
                            if(k==i || l==j)
                            {
                                arr2[k][l]=0;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<iR;i++)
        {
            for(int j=0;j<iC;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
     public static void main(String[] args) {
    
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
        System.out.println();
        changeRowCol(arr,iR,iC);
    }
    
}


// I/P:

// 2 3
// 1 0 1
// 1 1 1

// O/P:

// 0 0 0
// 1 0 1