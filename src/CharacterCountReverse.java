import java.util.*;
public class CharacterCountReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
	       String s1=sc.next();
	       int iCount=0;
           for(int i=0;i<s1.length();i++)
           {
        	   if(Character.isDigit(s1.charAt(i)))
        	   {
        		   iCount=Integer.parseInt(String.valueOf(s1.charAt(i)));
        		   int num=0;
        		   while(num<iCount)
        		   {
        			   System.out.print(s1.charAt(i-1));
        			   num++;
        			   

        			   
        		   }
        	   }
           }


	}

}
