import java.util.*;
public class Leaders {
      public static void main(String args[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  int iNum=sc.nextInt();
    	  int iArr[]=new int[iNum];
    	  for(int i=0;i<iNum;i++)
    	  {
    		  iArr[i]=sc.nextInt();
    	  }
    	  ArrayList<Integer> al=new ArrayList<>();
    	  for(int i=0;i<iNum;i++)
    	  {
    		  int iCount=0;
    		  for(int j=i+1;j<iNum;j++)
    		  {
    			  if(iArr[i]<iArr[j])
    			  {
    				  iCount++;
    			  }
    		  }
    		  if(iCount==0)
    		  {
    			  al.add(iArr[i]);
    		  }
    	  }
    	  for(int i=0;i<al.size();i++)
    	  {
    		  System.out.println(al.get(i));
    	  }
      }
}
