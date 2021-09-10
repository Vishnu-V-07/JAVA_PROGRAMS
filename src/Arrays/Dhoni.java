package Arrays;
import java.util.*;
public class Dhoni {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {
                al.add(Integer.parseInt(String.valueOf(s1.charAt(i))));
            }

        }
        int count=0;
       
        for(int i=0;i<al.size();i++)
        {
            String a=String.valueOf(al.get(i));
            
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)=='7')
                {
                    count++;
                }
            }
            
        }
        if(count>=1)
        {
            System.out.println("Boom!");
        }
        else{
            System.out.println("there is no 7 in the array");
        }
        
    }
    
}

//Create a function that takes an array of numbers and return "Boom" if the digit 7
//appears in the array.Otherwise return "there is no 7 in the array"

//[1,2,3,4,5,6,7]  ==>Boom

//[8,6,33,97] ==>Boom (97 contains 7)

//[2,3,8,9]  ==>there is no 7 in the array