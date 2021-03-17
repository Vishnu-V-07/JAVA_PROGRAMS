import java.util.*;
public class Password {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
      Boolean check=true;
      if(isValid(s1))
      {
    	  System.out.println("password is valid");
      }
      else {
    	  System.out.println("Password is not valid");
      }
	}
      public static Boolean  isValid(String s1)
      {
      
    	  Boolean check=true;
	      if(s1.length()>=8 && s1.length()<=10)
	      {
	    	  check=true;
	    	  
	      }
	      else {
	    	  System.out.println("Password should contain minimum 8 characters and maximum 10 characters");
	    	  check=false;
	
	      }
	      String upper="(.*[A-Z].*)";
	      String number="(.*[0-9].*)";
	      if(!((s1.matches(upper))|| (s1.matches(number))))
	      {
	    	  
	    	  System.out.println("Atleast one uppercase alphabet or integer is present");
	    	  check=false;
	      }
	      return check;
      }

      
      
	

}
