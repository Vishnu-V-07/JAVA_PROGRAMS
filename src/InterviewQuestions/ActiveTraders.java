package InterviewQuestions;
import java.util.*;
public class ActiveTraders {

    public static void toSortPercent(ArrayList<String> al)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        TreeSet<String> ts=new TreeSet<>();
        for(int i=0;i<al.size();i++)
        {
            int b=Collections.frequency(al,al.get(i));
            hm.put(al.get(i),b);
        }
        System.out.println(hm);
        for(Map.Entry<String,Integer> entry:hm.entrySet())
        {
            int a=entry.getValue();
            float v=(float)a;
            float v1=(float)al.size();
            float b=(float)((v/v1)*100);
           // System.out.println(b);
            int c=(int)b;
           // System.out.println(c);
            if(c>=5)
            {
                String s1=entry.getKey();
                ts.add(s1);

            }
        }
        System.out.println(ts);
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
        toSortPercent(al);
    }
    
}


// 23
// BigCrop
// BigCrop
// Acme
// BigCrop
// Zork
// Zork
// Abc
// BigCrop
// Acme
// BigCrop
// BigCrop
// Zork
// BigCrop
// Zork
// Zork
// BigCrop
// Acme
// BigCrop
// Acme
// BigCrop
// Acme
// Littlecorp
// Nadircorp