package Arrays;
import java.util.*;
public class Search {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<iNum;i++)
        {
            if(key==arr[i])
            {
                System.out.println(i);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
        }
        
    }
    
}

// 7
// 10 3 40 20 50 80 70
// 40
// 2