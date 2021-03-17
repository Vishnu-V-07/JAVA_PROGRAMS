import java.util.*;
public class CombinationofNumbersorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String val="[0-9]*$";
		if(s1.matches(val))
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
