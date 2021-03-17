import java.util.*;
public class LargestPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[iNum];
		for(int i=0;i<iNum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		int iCount=0;
		for(int i=0;i<iNum;i++)
		{
			iCount+=(int)Math.log10(iArr[i])+1;
		}
		System.out.println(iCount);
		int iA[]=new int[iCount];
		int j=0;
		for(int i=0;i<iNum;i++)
		{
			while(iArr[i]>0 && j<iCount)
			{
				iA[j]=iArr[i]%10;
				iArr[i]/=10;
				j++;
			}
		}
		Arrays.sort(iA);
		for(int i=iA.length-1;i>=0;i--)
		{
			System.out.print(iA[i]+" ");
		}
		

	}

}
