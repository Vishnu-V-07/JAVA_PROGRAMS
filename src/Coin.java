import java.util.*;
public class Coin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iCount=0;
		while(iNum>0) {
		if(iNum>5)
		{
			iNum=iNum%5;
			iCount++;
		}
		
		else if(iNum>2)
		{
			iNum=iNum%2;
			iCount++;
		}
		else if(iNum>1)
		{
			iNum=iNum%1;
			iCount++;
		}
		System.out.println(iCount);
		}

	}

}
