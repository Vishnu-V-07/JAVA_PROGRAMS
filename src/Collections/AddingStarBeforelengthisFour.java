package Collections;
import java.util.*;
public class AddingStarBeforelengthisFour {
    public static void AddingStar(ArrayList<String> al,int iNum)
    {
        String temp="";
        //ArrayList<String> al2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
         for(int i=0;i<iNum;i++)
         {
            temp=sc.next();
            if(temp.length()==4)
            {
               al.add("****");
               al.add(temp);
            }
            else{
                al.add(temp);
            }
            temp="";
         }
         System.out.println(al);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        ArrayList<String> al=new ArrayList<>();
        AddingStar(al,iNum);
        sc.close();
    }
    
}

//I/P:
// 9
// this is lots of fun for every java programmer

// O/P:
// [****, this, is, ****, lots, of, fun, for, every, ****, java, programmer]
