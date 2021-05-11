package Collections;
import java.util.*;
public class SwitchPairs {
    public static void Pairs(ArrayList<String> al){ 
        String temp="";
        if(al.size()%2==0)
        {
            for(int i=0;i<al.size();i=i+2)
            {
                temp=al.get(i);
                al.set(i,al.get(i+1));
                al.set(i+1,temp);
            }
            temp="";
        }
        else{
           for(int i=0;i<al.size()-1;i=i+2)
           {
               temp=al.get(i);
               al.set(i,al.get(i+1));
               al.set(i+1,temp);
           }
           temp="";

        }
        System.out.println(al);
       
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
         int iNum=sc.nextInt();
         for(int i=0;i<iNum;i++)
         {
            al.add(sc.next());
         }
         Pairs(al);
         sc.close();
    }
    
    
}
// I/P:
// 6 
// four score and seven years ago
// OP:
// [score, four, seven, and, ago, years]