//Given the series as  1 2 4 8 16 32 64
package Nterm;
import java.util.*;
public class Nterm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iA=1;
		int iArr[]=new int[iNum+1];
		iArr[0]=1;
		for(int i=1;i<iNum;i++)
		{ 
			
			iA=iA*2;
			iArr[i]=iA;
            		
		}
		int iFind=sc.nextInt();
		System.out.println(iArr[iFind-1]);
		
		
		
        		
	}

}
