package Arrays;
import java.util.*;
public class NextGreatest {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<iNum-1;i++)
        {
            int a=arr[i];
            for(int j=i+1;j<iNum;j++)
            {
                if(arr[j]>a)
                {
                    a=arr[j];
                    arr[i]=a;
                    
                  
                }
            }
        }
        arr[iNum-1]=-1;
        System.out.println(Arrays.toString(arr));
    }
}


// 5
// 2 1 4 3 2

//O/p:
// [4, 4, 4, 3, -1]