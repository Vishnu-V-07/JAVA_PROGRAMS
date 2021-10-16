package Arrays;
import java.util.*;
public class Extraelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int iNum2=sc.nextInt();
        int arr[]=new int[iNum];
        int arr2[]=new int[iNum2];
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int j=0;j<iNum2;j++)
        {
            arr2[j]=sc.nextInt();
           
        }
        int a=0;
      
        // }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<iNum2;i++)
        {
           al.add(arr2[i]);
           
          
        }
        for(int i=0;i<iNum;i++)
        {
            if(!al.contains(arr[i]))
            {
                a=arr[i];
            }
           
        }
        for(int i=0;i<iNum;i++)
        {
            if(a==arr[i])
            {
                System.out.println("The extra element is "+a);
                System.out.println("Its index is "+i);
            }
        }
    

    }
    
}

// 7
// 6
// 2 4 6 8 9 10 12
// 2 4 6 8 10 12

//9
// 4