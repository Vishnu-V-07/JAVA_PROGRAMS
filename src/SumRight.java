import java.util.*;
public class SumRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inum=sc.nextInt();
		int iArr[]=new int[inum];
		int iA[]=new int[inum];
		int iB[]=new int[inum];


		for(int i=0;i<inum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		int iSum=0;
		for(int i=0;i<inum;i++)
		{
			iSum+=iArr[i];
		}
		int temp=iSum;
		for(int i=0;i<inum;i++)
		{
			temp=temp-iArr[i];
			iArr[i]=temp;
		}
		
		
		for(int i=0;i<inum;i++)
		{
			System.out.println(iArr[i]+" ");

		}
		

	}

}
