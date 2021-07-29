package Arrays;
import java.util.*;
public class sortarrsum {
    public static ArrayList recursive(int arr[],ArrayList<Integer> al)
    {
        int sum=0;
        for(int i=0;i+1<arr.length;i=i+2)
        {
            
           sum=arr[i]+arr[i+1];
           al.add(sum);
            
            
        }
        if(!(arr.length%2==0))
        {
            al.add(arr[arr.length-1]);
        }
        return al;
    }
    public static void alsum(ArrayList<Integer> al)
    {
     
        int sum=0;
       while(al.size()>1)
       {
        ArrayList<Integer> al2=new ArrayList<>(al);
        al.clear();
         sum=0;
        for(int i=0;i+1<al2.size();i=i+2)
        {
            
           sum=al2.get(i)+al2.get(i+1);
           al.add(sum);
       }
       if(!(al2.size()%2==0))
       {
           al.add(al2.get(al2.size()-1));
       }
       System.out.println(al);
       al2.clear();
    }
    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int arr[]=new int[iNum];
        ArrayList<Integer> al=new ArrayList<>();
      
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        recursive(arr,al);
        System.out.println(al);
        if(al.size()>1)
        {
            alsum(al);
        }
        
        

    }
    
}

// I/P:
// 5
// 10 15 20 25 30

// O/P:
// [25, 45, 30]
// [70, 30]
// [100]