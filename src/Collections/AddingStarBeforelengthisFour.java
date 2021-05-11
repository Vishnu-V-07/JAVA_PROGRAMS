package Collections;
import java.util.*;
public class AddingStarBeforelengthisFour {
    public static void AddingStar(ArrayList<String> al,int iNum)
    {
        String temp="";
        ArrayList<String> al2=new ArrayList<>();
         for(int i=0;i<iNum;i++)
         {
            temp=al.get(i);
            if(temp.length()==4)
            {
               al2.add("****");
               al2.add(al.get(i));
            }
            else{
                al2.add(al.get(i));
            }
            temp="";
         }
         System.out.println(al2);
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
        AddingStar(al,iNum);
        sc.close();
    }
    
}

//I/P:
// 9
// this is lots of fun for every java programmer

// O/P:
// [****, this, is, ****, lots, of, fun, for, every, ****, java, programmer]
