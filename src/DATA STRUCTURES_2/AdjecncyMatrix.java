import java.util.*;
public class AdjecncyMatrix {
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
                System.out.println("If there is any edges between "+i+"&&"+j);
                int a=sc.nextInt();
                if(a==1)
                {
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
