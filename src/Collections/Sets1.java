package Collections;
import java.util.*;
import java.util.NavigableSet;
public class Sets1 {
    public static void display(HashSet<Integer>hs,LinkedHashSet<Integer>lhs,TreeSet<Integer>ts)
    {
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=1;i<=iNum;i++)
        {
            hs.add(i);
            lhs.add(i);
            ts.add(i);

        }
        display(hs,lhs,ts);
        sc.close();
    }
    
}
