import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		
		String s2=sc.next();
		char cA[]=s1.toCharArray();
		Arrays.sort(cA);

		
		char cB[]=s2.toCharArray();
		Arrays.sort(cB);

		int ires=Arrays.compare(cA,cB);
		if(ires==0)
		{
			System.out.println("it is Anagram");

		}
		else {
			System.out.println("Not an Anagram");

		}
		
		

	}

}


// listen
// silent
// it is Anagram

// race
// care
// it is Anagram


//cat
//dog
//it is not a anagram