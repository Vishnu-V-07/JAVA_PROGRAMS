import java.util.*;
public class perfect {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int sum=0;
		int a=iNum;
		for(int i=1;i<iNum;i++)
		{
			if(iNum%i==0)
			{
				sum+=i;
			}
		}
		if(sum==a)
		{
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}

	}

}


// 6

//2 3 1=>2 + 3 +1=6==6
// Perfect