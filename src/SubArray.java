import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[iNum];
		for(int i=0;i<iNum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		for(int i=0;i<iArr.length;i++)
		{
			for(int j=i+1;j<iArr.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(iArr[k]+" ");
				}
				System.out.println();
			}
		}

	}

}
