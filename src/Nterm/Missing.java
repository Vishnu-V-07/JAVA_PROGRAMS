package Nterm;
import java.util.*;
public class Missing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
        int iArr[]=new int[iNum-1];
        int iSum=0;
        for(int i=0;i<iNum-1;i++)
        {
        	int b=sc.nextInt();
             iArr[i]=b;
             iSum+=iArr[i];
        }
        int itotal=(iNum*(iNum+1))/2;
        int res=itotal-iSum;
        System.out.println(res);
       
        
	}

}
