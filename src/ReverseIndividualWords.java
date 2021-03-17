import java.util.*;
public class ReverseIndividualWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sArr[]=s1.split(" ");
		String s3="";
		for(int i=0;i<sArr.length;i++)
		{
			s3=sArr[i];
			for(int j=s3.length()-1;j>=0;j--)
			{
				System.out.print(s3.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
