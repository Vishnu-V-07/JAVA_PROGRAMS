import java.util.*;
public class ValidStringorNot {
	static boolean validNum(String s1) {
		//int a=Integer.parseInt(s1);
				int count=0;
				int flag=0;
				int dup=0;
				for(int i=0;i<s1.length();i++)
				{
				if(Character.isDigit(s1.charAt(i)))
				
				{
					count++;
				
				}
				if(Character.isAlphabetic(s1.charAt(i)))
					
				{
					flag++;
				
				}

				}
				if(count==s1.length())
				{
					//System.out.println("True");
					//dup=1;
					return true;
					//return;
				}
				if(flag==s1.length())
				{
					//System.out.println("false");
					//dup=0;
					return false;
				}
		       // int e=0,c=0;
				for(int i=0;i<s1.length()-1;i++)
				{
//					if(i<s1.length()-1)
//					{
				 //  if(Character.isDigit(i)) {
				   if( (s1.charAt(i)=='e' || s1.charAt(i)=='E') &&  Character.isDigit(i+1))
		     	   {
					 // e=1;
					  // dup=1;
					   return true;
					   
						   }
				   else {
					   return false;
				   }
//				   else if(Character.isDigit(i) && (Character.isAlphabetic(i+1) && s1.charAt(i+1)))
//				   {
//					   c=1;
//				   }
				}
//				if(e==1 )
//				{
//					//System.out.println("True");
//					//return;
//					dup=1;
//				}
//				else  {
//					//System.out.println("False");
//					dup=0;
		//
//				}

					//}
				//}
//				int f=0;
//				int l=0;
				for(int i=1;i<s1.length();i++)
				{
					if(s1.charAt(i-1)=='.' && Character.isDigit(s1.charAt(i)))
					{
						//f=1;
						//dup=1;
						return true;
					}
					if(s1.charAt(i)=='.' && Character.isDigit(s1.charAt(i-1)))
					{
						//l=1;
						//dup=1;
						return true;
					}
					else {
//						dup=0;
						return false;
					}

				}
//				if(f==1 || l==1)
//				{
//					//System.out.println("True");
//					//return;
//					dup=1;
//				}
//				else {
//					//System.out.println("False");
//					dup=0;
//					
//					
		//
//				}

//				int g=0;
//				int h=0;
				for(int i=1;i<s1.length();i++)
				{
					if(s1.charAt(i-1)=='+' && Character.isDigit(s1.charAt(i)))
					{
//						g=1;
						//dup=1;
						return true;
					}
					if(s1.charAt(i-1)=='-' && Character.isDigit(s1.charAt(i)))
					{
						//h=1;
						//dup=1;
						return true;
					}


				}
//				if(g==1 || h==1)
//				{
//					//System.out.println("True");
//					dup=1;
//				}
//				else {
//					//System.out.println("False");
//					dup=0;
//					//return;
		//
//				}
//				if(dup==1)
//				{
//					System.out.println("True");
//				}
//				else {
//					System.out.println("false");
//
//				}


			return false;	


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(validNum(s1));
		
	}

}
