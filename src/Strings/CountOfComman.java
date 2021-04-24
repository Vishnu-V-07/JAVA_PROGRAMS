package Strings;
import java.util.*;
public class CountOfComman{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int count=0;
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++)
            {
                if(!(al.contains(String.valueOf(s1.charAt(i)))))
                {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    count++;
                    al.add(String.valueOf(s1.charAt(i)));
                }
            }
            }
            }
      //  }
        System.out.println(count);
    }
}