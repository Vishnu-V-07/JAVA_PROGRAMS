import java.util.*;
public class Kposition {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int iNum=sc.nextInt();
       int iArr[]=new int[iNum];
       int iCount=0;
       for(int i=0;i<iNum;i++)
       {
    	   iArr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       for(int i=0;i<iNum;i++)
       {
    	   if(iArr[i]==k)
    	   {
    		   System.out.println(i+1);
    		   iCount++;
    		   
    	   }
       }
       if(iCount==0)
       {
    	   System.out.println("element is not found");
       }
	}

}
