package Arrays;
import java.util.*;
public class Union {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<n1;i++)
        {
            ts.add(sc.nextInt());
        }
        for(int i=0;i<n2;i++)
        {
            ts.add(sc.nextInt());
        }
        System.out.println(ts.size());
    }
    
}

// 6 2
// 85 25 1 32 54 6
// 85 2


// 7


// 5 3
// 1 2 3 4 5
// 1 2 3

// 5