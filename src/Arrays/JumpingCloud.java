package Arrays;
import java.util.*;
class JumpingCloud  { 
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int i=0;
        while(i<arr.length-1 && i+2<arr.length)
        {
            if(arr[i+2]==0)
            {
                count++;
                i=i+2;
            }
            else if(arr[i+1]==0)
            {
                count++;
                i=i+1;
            }
                
            
        }
      
        System.out.println(count);
    }
}
// 7
// 0 0 1 0 0 1 0
// 4