import java.util.*;
public class JoinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		
		int ilen=s1.length()+s2.length();
		char cArr[]=new char[ilen];
		int j=0;
		for(int i=0;i<ilen;i++)
		{
			if(i<s1.length())
			{
				cArr[i]=s1.charAt(i);
			}
			else
			{
				cArr[i]=s2.charAt(j);
				j++;
			}
		}
		for(int i=0;i<ilen;i++)
		{
			System.out.print(cArr[i]);
		}

		

	}

}
