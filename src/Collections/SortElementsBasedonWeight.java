package Collections;
import java.util.*;
public class SortElementsBasedonWeight
{
    public static void toSort(ArrayList<Integer> al)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> dup=new ArrayList<>();
        ArrayList<Integer> value=new ArrayList<>();
        for(int i=0;i<al.size();i++)
        {
            int a=al.get(i);
            double c=(double)a;
            int b=(int)Math.sqrt(a);
            int sum=0;
            if(b*b==a)
            {
               // hm.put(al.get(i),5);
               sum+=5;
            }
            if(a%4==0 && a%6==0)
            {
               // hm.put(a,4);
               sum+=4;
            }
            if(a%2==0)
            {
               // hm.put(a,3);
               sum+=3;
            }
            else{
                sum+=0;
            }
            hm.put(a,sum);
            sum=0;
            
            
        }
        System.out.println(hm);
       
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            value.add(entry.getValue()); 
        }
        Collections.sort(value);
        for(int i=0;i<value.size();i++)
        {
            int v=value.get(i);
            for(Map.Entry<Integer,Integer> entry:hm.entrySet())
            {
                if(entry.getValue()==v && !dup.contains(entry.getKey()))
                {
                    System.out.print(entry.getKey()+" ");
                    System.out.print(entry.getValue()+" ");
                    dup.add(entry.getKey());
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
        toSort(al);
    }
}


// 5
// 10 36 54 89 12


// {36=8, 54=3, 89=0, 10=3, 12=3}
// 89 54 10 12 36
