package TwoDArrays;
import java.util.*;
public class SpiralAntiClockwise {
    public static void AntiClockwise(int arr[][],int r,int c,int rot)
    {
        int t=r;
        int t2=c;
       for(int k=0;k<rot;k++)
       {
            int row=0;
            int col=0;
            r=t;
            c=t2;
            int prev=0,curr=0;
            if(r==c)
            {
                while(row<r && col<c)
                {
                
                    if(row+1==r || col+1==c)
                    {
                        break;
                    }
                    prev=arr[row+1][c-1];
                    for(int i=c-1;i>=col;i--)
                    {
                        curr=arr[row][i];
                        arr[row][i]=prev;
                        prev=curr;

                    }
                    row++;
                    for(int i=row;i<r;i++)
                    {
                        curr=arr[i][col];
                        arr[i][col]=prev;
                        prev=curr;

                    }
                    col++;
                    for(int i=col;i<c;i++)
                    {
                        curr=arr[r-1][i];
                        arr[r-1][i]=prev;
                        prev=curr;

                    }
                    r--;
                    for(int i=r-1;i>=row;i--)
                    {
                        curr=arr[i][c-1];
                        arr[i][c-1]=prev;
                        prev=curr;

                    }
                    c--;


                }
            }
            else{
                System.out.println("Row and column size should be equal");
            }
        }
            for(int i=0;i<t;i++)
            {
                for(int j=0;j<t2;j++)
                {
                    System.out.print(arr[i][j]+" ") ;
                }
                System.out.println();
            }
        }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int rot=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        AntiClockwise(arr,r,c,rot);
        

    }
    
}
