package Strings;
import java.util.*;
public class duplicateElement {
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            String s1=sc.nextLine();
            String s2="";
            String s3="";
            int count=0;
            int max=0;
            int dup=0;
            for(int i=0;i<s1.length();i++)
            {
                count=0;
                for(int j=i;j<s1.length();j++){
                if(s1.charAt(i)!=s1.charAt(j))
                {
                    s2+=s1.charAt(i);
                }
                else{
                    count++;
                }
            }
            if(count>1)
            {
                if(!(s3.contains(String.valueOf(s1.charAt(i)))))
                {
                s3+=s1.charAt(i);
                max=1;
                }
            }
            }
            if(max==1)
            {
                System.out.println(s3);
            }
            else{
                    System.out.println("No");
            }
            
    }
    
}
