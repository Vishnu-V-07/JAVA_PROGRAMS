import java.util.*;
public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       int iCount=1;
       char ch=s1.charAt(0);
       for(int i=1;i<s1.length();i++)
       {
    	   if(ch==s1.charAt(i))
    	   {
    		   iCount++;
    	   }
    	   else {
    		   System.out.print(ch+""+iCount);
    		   iCount=1;
    		   ch=s1.charAt(i);
    	   }
       }
   		System.out.print(ch+""+iCount);

       
	}
}
