package Arrays;
import java.util.*;
public class SorttheelementsbyitsfrequencyDescending {

    public static void SortDes(ArrayList<Integer> al)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        ArrayList<Integer> al4=new ArrayList<>();
        for(int i=0;i<al.size();i++)
        {
            
            int a=Collections.frequency(al,al.get(i));
            if(!al2.contains(a) || !al3.contains(al.get(i)))
            {
                hm.put(al.get(i),a);
                al2.add(a);
                al3.add(al.get(i));
            }
        }
        Collections.sort(al2,Collections.reverseOrder());
        System.out.println(al2);
        System.out.println(hm);
        for(int i=0;i<al2.size();i++)
        {
            int c=al2.get(i);
        
            for(Map.Entry<Integer,Integer> entry:hm.entrySet())
            {
                int f=entry.getKey();
                if(entry.getValue()==c && !al4.contains(f))
                {
                    int d=entry.getKey();
                    for(int j=0;j<c;j++)
                    {
                        System.out.print(d+" ");
                    }
                    al4.add(d);
                }
            }
        }
      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<iNum;i++)
        {
           al.add(sc.nextInt());
        }
        SortDes(al);

    }
    
}


// I/P:

// 11
// 2 2 3 4 5 12 2 3 3 3 12

// 5
// 0 -1 2 1 0


// O/P:

// 3 3 3 3 2 2 2 12 12 4 5


// 0 0 -1 1 2
