import java.util.*;
public class RepeatStringStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int count=0;
		char c1[]=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			count=0;
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.print(c1[i]+"*");
			}
			else {
				System.out.print(c1[i]);
			}
		}
	
			
		

	}

}
