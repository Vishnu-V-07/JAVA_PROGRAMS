import java.util.*;
public class Stringgoodorbad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		char ch[]=s1.toCharArray();
		int iV=0,iC=0,
		iFlag=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]== 'e' || ch[i]== 'i' || ch[i]== 'o' || ch[i]== 'u')
			{
				iV++;
			}
			else {
				iC++;
			}
		}
		if(iV>5 || iC<3)
		{
			iFlag=1;
		}
		if(iFlag==1)
		{
			System.out.println("Bad");
		}
		else {
			System.out.println("Good");
		}

	}

}
