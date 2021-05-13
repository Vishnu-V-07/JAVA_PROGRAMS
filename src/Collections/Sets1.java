package Collections;
import java.util.*;
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
        HashSet<Integer> hs=new HashSet<Integer>();
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int i=0;i<iNum;i++)
        {
            int k=sc.nextInt();
            hs.add(k);
            lhs.add(k);
            ts.add(k);

        }
        display(hs,lhs,ts);
        sc.close();
    }
    
}
// 5
// 9 10 6 5 4