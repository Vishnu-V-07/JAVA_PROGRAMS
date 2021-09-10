package Arrays;
import java.util.*;
public class NotUnique {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();//7
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();

        for(int i=0;i<iNum;i++)
        {
           al.add(sc.nextInt());
           
        }
        for(int i=0;i<iNum;i++)
        {
            int b=Collections.frequency(al,al.get(i));
            if(b>=2 && !al2.contains(b))
            {
                System.out.println(b);
                al2.add(b);
            }
        }

    }
    
}

// I/P:

// 7
// 1 2 3 2 3 4 3

// O/P:
// 2
// 3