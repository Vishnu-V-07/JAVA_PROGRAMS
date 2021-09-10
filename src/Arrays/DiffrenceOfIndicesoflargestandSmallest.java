package Arrays;
import java.util.*;
public class DiffrenceOfIndicesoflargestandSmallest {

    public static void Diff(int arr[],int iNum)
    {
        int a2[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            a2[i]=arr[i];
        }
        Arrays.sort(arr);
        int l=arr[0];
        int h=arr[iNum-1];
        int l1=0,h1=0;
        for(int i=0;i<iNum;i++)
        {
            if(a2[i]==h)
            {
                h1=i;
            }
            else if(a2[i]==l)
            {
                l1=i;
            }
            if(l1!=0 && h1!=0)
            {
                break;
            }
        }
       int diff=h1-l1;
       System.out.println(diff);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        Diff(arr,iNum);


    }
    
}

// I/P:

// 5
// 1 6 4 0 3
// largest element =6, index=1
// small element is=0 index=3

//diff=1-3;



// O/P:


// -2