package Strings;
import java.util.*;
public class AlmostEquivalentStrings {
    public static void Equivalent(String s1,String s2)
    {
        if(s1.length()==s2.length())
        {
            Set<Character> ts=new TreeSet<>();
            Set<Character> ts1=new TreeSet<>();
            for(int i=0;i<s1.length();i++)
            {
                ts.add(s1.charAt(i));
            }
            for(int i=0;i<s2.length();i++)
            {
                ts1.add(s1.charAt(i));
            }
            int count=0;
            int count2=0;
            int diff=0;
            List<Character> al=new ArrayList<>(ts);
            List<Character> al2=new ArrayList<>(ts1);
            List<Integer> al3=new ArrayList<>();
            char c,d='0';
            for(int i=0;i<al.size();i++)
            {
                c=al.get(i);
                
                for(int j=0;j<al2.size();j++)
                {
                    if(c==al2.get(j))
                    {
                        d=al2.get(j);
                    }
                }
                for( int j=0;j<s1.length();j++)
                {
                    if(d==s1.charAt(j))
                    {
                        count++;
                    }
                }
                for( int j=0;j<s2.length();j++)
                {
                    if(d==s2.charAt(j))
                    {
                        count2++;
                    }
                }
                if(count>count2)
                {
                    diff=count-count2;
                }
                else{
                    diff=count2-count;
                }
                al3.add(diff);
                
            }
            Collections.sort(al3);
          //  System.out.println(al3);
            int v=al3.get(al3.size()-1);
            //System.out.println(v);
            if(v<=3)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            System.out.println("String length must be equal");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Equivalent(s1,s2);
    }
    
}
