import java.util.*;
public class String28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3="";
		for(int i=0;i<s2.length();i++)
		{
			s1=s1.replaceAll(Character.toString(s2.charAt(i)),"");
		}
		System.out.println(s1);
	}

}
