package Strings;
import java.util.*;
public class bag {
    public static void SimilarBag(ArrayList<String> al)
    {
        TreeSet<String> ts =new TreeSet<>(al);
        ArrayList<String> al2=new ArrayList<>(ts);
        ArrayList<String> al3=new ArrayList<>();
        int b=ts.size();
        int count=0;
        for(int i=0;i<al.size();i++)
        {
            String s1=al.get(i);
            int a=Collections.frequency(al,al.get(i));
            if(a>=2)
            {
                System.out.print((i+1)+" ");
            }
            
        }
        System.out.println();
        System.out.println(b);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<iNum;i++)
        {
            al.add(sc.next());
        }
        SimilarBag(al);
    }
}

// I/p:
// 3
// abcd
// cdef
// abcd

// O/P:
// 1 3
// 2