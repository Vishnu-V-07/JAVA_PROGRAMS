import java.util.*;
public class StartsVowelendsConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String s1=sc.nextLine();
		 int iV=0,iC=0;
		 for(int i=0;i<s1.length();i++)
		 {
			 if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'  )
			 {
				 iV=i;
				 break;
			 }
			
		 }
		 for(int i=iV;i<s1.length();i++)
		 {
			 if(!(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'  ))
			 {
				 iC=i;
				 break;
			 }
			
		 }
		 String s3=s1.substring(iV,iC+1);
		 System.out.println(s3);
		
	}

}
