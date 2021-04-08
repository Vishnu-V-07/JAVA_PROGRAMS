//JAVA PROGRAM TO DISPLAY LONGEST WORD IN A SENTENCE

package Strings;
import java.util.*;
public class longestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		String s3="";
		int temp=0;
		String sArr[]=s1.split(" ");
		
		for(int i=0;i<sArr.length-1;i++)
		{
			temp=sArr[i].length();
			if(sArr[i+1].length() > temp )
			{
				s3=sArr[i+1];
			}
		}
		System.out.println(s3);
     
	}

}
