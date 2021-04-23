// JAVA PROGRAM TO PRINT THE LARGEST SPECIAL PRIME NUMBER FROM THE GIVEN NUMBER 
// I/P:
// 100
// O/P:
// 79

package Numbers;
import java.util.*;
public class LargestSpecialPrime
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		sc.close();
		for(int k=iNum;k>0;k--)
		{
		   
	    int count=0;
		String s1=Integer.toString(k);
	
		int flag=0;
		int dup=0;
		dup=k;
		int d=0;
	
    		while(dup>0)
    		{
    		 
    		    for(int i=2;i<=dup/2;i++)
    		    {
    		        if(dup%i==0)
    		        {
    		            flag=1;
    		          
    		            break;
    		        }
    		    }
    		    if(flag==0)
    		    {
    		        count++;
    		      
    		    }
                if(count==s1.length())
                { 
                    d=1;    
                }
    		 
    	     	dup=dup/10;
    		}
            if(d==1)
            {
                System.out.println(k);
                break;
            }
    		s1="";
    	
		}
	}
}
