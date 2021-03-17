import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iS=sc.nextInt();
		
		int iE=sc.nextInt();
		int iCount=0;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=iS;i<=iE;i++)
		{
			iCount=0;
		    for(int j=1;j<=i;j++)
		    {
		    	if(i%j==0)
		    	{
		    	   iCount++;
		    	}
		    }
		    if(iCount==2)
		    {
		    	al.add(i);
		    }
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		int iNum=al.size();
		int iArr[]=new int[iNum];
		int flag=0;
		int add=0;
		for(int i=0;i<al.size();i++)
		{
			iArr[i]=al.get(i);
		}
		for(int i=0;i<iArr.length;i++)
		{
			for(int j=i+1;j<iArr.length;j++)
			{
				 add=iArr[i]+iArr[j];
				 flag=0;
				for(int k=1;k<=add;k++)
				{
					
					if(add%k==0)
					{
						flag++;
					}
				}
				if(flag==2)
				{
					System.out.println(iArr[i]+" + "+iArr[j]+" = "+add);
				}

				
			}
		}
	

	}

}
