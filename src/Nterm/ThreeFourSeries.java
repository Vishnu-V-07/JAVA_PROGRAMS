package Nterm;
import java.util.*;
public class ThreeFourSeries {
    public static void Series(int iNum)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(4);
        if(iNum==1)
        {
            System.out.println(3);
        }
        else if(iNum==2)
        {
            System.out.println(4);
        }
        else{
            int i=33;
            while(al.size()!=iNum)
            {
                String s1=String.valueOf(i);
                int count=0;
                for(int j=0;j<s1.length();j++)
                {
                    if(s1.charAt(j)=='3' || s1.charAt(j)=='4')
                    {
                        count++;
                        
                    }
                }
                if(count==s1.length())
                {
                    al.add(Integer.parseInt(s1));
                   
                }
                if(al.size()==iNum)
                {
                    break;
                }
                s1="";
                i++;
                count=0;
            }
            System.out.println(al);
            System.out.println(al.get(iNum-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        Series(iNum);
    }
    
}

// 5
// [3, 4, 33, 34, 43]

// 43