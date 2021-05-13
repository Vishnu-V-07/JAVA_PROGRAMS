package Collections;
import java.util.*;
public class WorkingTreeset {
    public static void Reverse(TreeSet<Integer> ts)
    {
        TreeSet<Integer> ts1=new TreeSet<>(Collections.reverseOrder());
        Iterator itr=ts.iterator();
        while(itr.hasNext())
        {
            ts1.add((int)itr.next());
        }
        
        System.out.println(ts1);
    }
    public static void Iterate(TreeSet<Integer> ts)
    {
       Iterator itr=ts.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
        
    }
    public static void Search(int search,TreeSet<Integer> ts)
    {
       Iterator itr=ts.iterator();
       int flag=0;
       while(itr.hasNext())
       {
           int s=(int)itr.next();
           if(s==search)
           {
               System.out.println("Element is present");
               flag=1;
               break;
           }
           else{
               flag=0;
           }
       }
       if(flag!=1)
       {
           System.out.println("Element not found");
       }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<iNum;i++)
        {
            ts.add(sc.nextInt());
        }
        Reverse(ts);
        Iterate(ts);
        System.out.println("Enter the element to search");
        int search=sc.nextInt();
        Search(search,ts);
    }
    
}

// I/P:
// 5
// 1 2 3 4 5