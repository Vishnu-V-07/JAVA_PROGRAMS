import java.util.*;
public class String29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			if((Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i]))&&(Character.isAlphabetic(ch[j])|| Character.isDigit(ch[j])))
			{
				char t=ch[i];
				ch[i]=ch[j];
				ch[j]=t;
				i++;
				j--;
			}
			else if((!Character.isAlphabetic(ch[i]) || !Character.isDigit(ch[i]))&&(Character.isAlphabetic(ch[j])|| Character.isDigit(ch[j])))
			{
				i++;
			}
			else if((Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i]))&&(!Character.isAlphabetic(ch[j])|| !Character.isDigit(ch[j])))
			{
				j--;
			}

			else {
				i++;
				j--;
			}

		}
		for(int k=0;k<ch.length;k++)
		{
			System.out.print(ch[k]);
		}

	}

}
