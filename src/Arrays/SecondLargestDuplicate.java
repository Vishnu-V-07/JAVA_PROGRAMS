package Arrays;
import java.util.*;
class SecondLargestDuplicate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        int arr2[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        Arrays.sort(arr);
        int a=arr[arr.length-2];
        int count=0;
        for(int i=0;i<iNum;i++)
        {
            if(a==arr[i])
            {
                count++;
            }
        }
        if(count>=2)
        {
            System.out.println(-1);
        }
        else{
            for(int i=0;i<iNum;i++)
            {
                if(a==arr2[i])
                {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}


// 6
// 18 11 12 13 16 11
// 4


// 6
// 1 3 3 2 5 5
// -1