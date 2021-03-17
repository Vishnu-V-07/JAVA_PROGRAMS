import java.util.*;
public class String26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				sum+=Integer.parseInt(String.valueOf(s1.charAt(i)));
			}
		}
		System.out.println(sum);

	}

}
