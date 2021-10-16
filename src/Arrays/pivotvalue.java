// Partition the given array based on pivot value
// Given a pivot x,and list 1st,partition the list into three parts.the first part contains
// all the elements in the 1st that are less than x.The second part contains all elements 
// in the list that are equal to x.The third part contains all elements in the lst
// that are larger than x.Ordering within a part can be arbitary.the algorithm result in
// minimum swaps.

// I/P:
// 7
// 9 12 3 5 14 10 10
// 10

// O/P:
// 3 5 9 10 10 12 14

package Arrays;
import java.util.*;
public class pivotvalue {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pivot=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        int a3[]=new int[n];
        int first=0,second=0,third=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<pivot)
            {
               a1[first]=arr[i];   
               first++;
            }
            else if(arr[i]==pivot)
            {
                a2[second]=arr[i];
                second++;
            }
            else if(arr[i]>pivot){
                a3[third]=arr[i];
                third++;
            }
        }
        Arrays.sort(a1,0,first);
        Arrays.sort(a3,0,third);
        for(int i=0;i<first;i++)
        {
            System.out.print(a1[i]+" ");
        }
        for(int i=0;i<second;i++)
        {
            System.out.print(a2[i]+" ");
        }
        for(int i=0;i<third;i++)
        {
            System.out.print(a3[i]+" ");
        }
        
    }
    
}
