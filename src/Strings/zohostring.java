package Strings;
import java.util.*;
public class zohostring {

    public static void checkContains(String s1,String s2)
    {
        String s3="";
        int flag=0;
        for(int i=0;i<s1.length();)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s2.charAt(j)=='*')
                {
                    s3+=s1.charAt(i);
                    s2=s2.substring(0,j)+String.valueOf(s1.charAt(i))+s2.substring(j+1,s2.length());
                //    System.out.println(s2);
                    if(s1.equals(s2) || s1.length()==s2.length())
                    {
                        break;
                    }
                    else{
                       
                        if(!s2.contains("*"))
                        {
                            s2=s2.substring(0,j+1)+"*"+s2.substring(j+1,s2.length());
                        }
                        else{
                            i++;
                        }
                        
                  
                    }
                }
                else{
                    s3+=s2.charAt(j);
                    i++;
                }
            }
            
            if(s1.contains(s3))
            {
                System.out.println("True");
                flag=1;
                break;
            }
          
        }
        if(flag==0)
        {
            System.out.println("False");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        checkContains(s1,s2);
        
    }
    
}

// spoon
// sp*n
// True


// zoho
// *o*o
// True

// man
// n*
// False

// subline
// line
// True