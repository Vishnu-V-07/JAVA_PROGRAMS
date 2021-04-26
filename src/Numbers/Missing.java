package Numbers;
import java.util.*;
public class Missing {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int k=1;
        for(int i=0;i<n;i++)
        {
            if(k==arr[i])
            {
                k++;
            }
            else{
                System.out.println(k);
                break;
            }
        }
    }
}
