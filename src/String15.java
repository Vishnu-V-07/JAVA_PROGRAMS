import java.util.*;
public class String15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iSum=0;
		int iArr[][]=new int[iNum][iNum];
		int iCount=0;
		int iC=0;
		for(int i=0;i<iNum;i++)
		{
			for(int j=0;j<iNum;j++)
			{
			 iArr[i][j]=sc.nextInt();
			}
		}
        for(int i=0;i<iNum;i++)
        {
        	for(int j=0;j<iNum;j++)
        	{
        	    if(i==j)
        	    {
        	    	if(iArr[i][j]==1)
        	    	{
        	    		iCount=1;
        	    	}
        	    	
        	    }
        	    if(i!=j)
        	    {
        	    	if(iArr[i][j]==0)
        	    	{
        	    		iC=1;
        	    	}

        	    }
        	}
        }
        if(iCount==1 && iC==1)
        {
        	System.out.println("Identity Matrix");
        }
        else {
        	System.out.println(" Not an Identity Matrix");

        	
        }


	}

}
