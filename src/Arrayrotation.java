

import java.util.*;
public class Arrayrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int Nr=sc.nextInt();
		int iArr[]= new int[iNum];
		for(int i=0;i<iNum;i++)
		{
	         iArr[i]=sc.nextInt();
		}
		for(int i=0;i<Nr;i++)
		{
			int iTemp=iArr[0];
			for(int j=0;j<iNum-1;j++)
			{
				iArr[j]=iArr[j+1];
			}
			iArr[iNum-1]=iTemp;
			
		}
		for(int i=0;i<iArr.length;i++)
		{
			System.out.print(iArr[i]+" ");
		}

	}

}
