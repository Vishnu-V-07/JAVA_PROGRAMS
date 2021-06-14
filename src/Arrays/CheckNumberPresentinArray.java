package Arrays;
import java.util.*;
public class CheckNumberPresentinArray {
    public static void checkElement(ArrayList<Integer> al,int iNum)
    {
        TreeSet<Integer> ts=new TreeSet<>();
       for(int i=0;i<al.size();i++)
       {
           int b=Collections.frequency(al,al.get(i));
           if(b==iNum)
           {
                ts.add(al.get(i));
                
           }
           
       }
       ArrayList<Integer> al2=new ArrayList<>(ts);
       if(al2.size()>0)
       {
           for(int i=0;i<al2.size();i++)
           {
               System.out.println(al2.get(i)+" ");
           }
       }
       else{
           System.out.println("-1");
       }
       

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<iNum;i++)
        {
           for(int j=0;j<k;j++)
           {
               al.add(sc.nextInt());
           }
        }
        
        checkElement(al,iNum);
    }
    
}

// I/P:

// 2 3
// 1 2 3
// 2 4 3

// O/P:
// 2
// 3