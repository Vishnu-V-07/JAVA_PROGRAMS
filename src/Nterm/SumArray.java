package Nterm;
import java.util.*;
public class SumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[iNum];
		for(int i=0;i<iNum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		int X=sc.nextInt();
		int c=0;
		int d=0;
		for(int i=0;i<iNum;i++)
		{
			for(int j=i+1;j<iNum;j++)	
			{
				d=iArr[i]+iArr[j];
				
				if(d==X)
				{
				 System.out.println("Exist");
				 c=1;
				 break;
				}
				
			}
			if(c==1)
			{
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Not Exist");
		}
		
		
		
	}

}
