package Numbers;
import java.util.*;
public class Nterm {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()-1;
     
      
        int l=1;
      
        for(int i=0;i<n;i++)
        {
            l+=l;
            
        
        }
        System.out.print(l);
    }
}
