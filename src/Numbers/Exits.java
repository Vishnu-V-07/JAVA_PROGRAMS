package Numbers;

import java.util.*;
public class Exits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==a)
                {
                    System.out.println("Exists");
                    b=1;
                    break;
                }
            }
            if(b==1)
            {
                break;
            }
        }
        if(b==0)
        {
            System.out.println("Not Exits");
        }
    }
    
}
