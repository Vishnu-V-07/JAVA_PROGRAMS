package Arrays;
import java.util.*;
public class SecondLargest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];
        int a2[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<l;k++)
        {
            a2[k]=arr[k];
        }
        Arrays.sort(arr);
        int second=arr[arr.length-2];
        int count=0;
        int flag=0;
        for(int i=0;i<l;i++)
        {
            if(a2[i]==second)
            {
                count++;
                flag=i;
            }         
            
        }
        if(count==1)
        {
            System.out.println(flag);
        }
        else{
            System.out.println("-1");
        }
    }
    
}
