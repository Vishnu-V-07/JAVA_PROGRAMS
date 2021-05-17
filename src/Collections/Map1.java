package Collections;
import java.util.*;
public class Map1 {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        HashMap<String,Integer> hm=new HashMap<>();
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        TreeMap<String,Integer> tm=new TreeMap<>();
        for(int i=0;i<iNum;i++)
        {
            String a=sc.next();
            int b=sc.nextInt();
            hm.put(a,b);
            lhm.put(a,b);
            tm.put(a,b);
        }
        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);

    }
}

// I/p:
// 5
// vishnu 1
// tilak 2
// tharun 3
// vignesh 4
// vinoth 5

// O/P:
// {tilak=2, vishnu=1, tharun=3, vignesh=4, vinoth=5}
// {vishnu=1, tilak=2, tharun=3, vignesh=4, vinoth=5}
// {tharun=3, tilak=2, vignesh=4, vinoth=5, vishnu=1}