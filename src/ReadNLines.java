import java.util.*;
public class ReadNLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s2="";		
	    int iNum=sc.nextInt();
	    String sArr[]=new String[iNum];
		for(int i=0;i<sArr.length;i++)
		{
			sArr[i]=sc.next();
		}
		for(int i=0;i<sArr.length;i++)
		{
			s2+=sArr[i];
		}
		System.out.println(s2);


	    

	}

}
