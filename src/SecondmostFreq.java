import java.util.*;
public class SecondmostFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int max=0,val=0;
		int iArr[]=new int[256];
		char ch[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			iArr[s1.charAt(i)]++;
		}
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
			int iF=0;
			for(int j=0;j<=i;j++)
			{
				if(s1.charAt(i)==ch[j])
				{
					iF++;
				}
			}
			if(iF==1)
			{
				System.out.println(s1.charAt(i)+":"+iArr[s1.charAt(i)]);
			}
		}
			int iA=0,iB=0;
			for(int i=0;i<256;i++)
			{
				if(iArr[i]>iArr[iA])
				{
					iB=iA;
					iA=i;
				}
				else if(iArr[i]>iArr[iB] && iArr[i]!=iArr[iA])
				{
					iB=i;
					System.out.println("Second most frequent character:"+(char)iB);
				}
			}
		
		
	}

}
