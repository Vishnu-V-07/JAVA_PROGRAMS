package Collections;
import java.util.*;
public class UniquePair {
    public static void toUnique(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        sc.nextLine();
        TreeSet<String> ts=new TreeSet<>();
        int arr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            ts.add(sc.nextLine());
            arr[i]=ts.size();
        }
        //System.out.println(ts);
        toUnique(arr);
    }
    
}

// I/P:
// 5
// john tom
// john mary
// john tom
// mary anna
// mary anna