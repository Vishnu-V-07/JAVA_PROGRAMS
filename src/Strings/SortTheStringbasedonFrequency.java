
// PROGRAM TO SORT THE STRING BASED ON FREQUENCY



// I/P:

// hi hello hi everyone



// O/P:

// everyone

// hello

// hi

// hi
package Strings;
import java.util.*;
public class SortTheStringbasedonFrequency {

public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();// hi everyone everyone hi hi hello //expected op: hello everyone everyone hi hi hi
     String sArr[]=s1.split(" ");//sArr[0]=hi ,sArr[1]=everyone ,sArr[2]=everyone
     ArrayList<String> a1=new ArrayList<>();
     ArrayList<Integer> a2=new ArrayList<>();
     for(int i=0;i<sArr.length;i++)
     {
    	 a1.add(sArr[i]);
     }
     for(int i=0;i<a1.size();i++)
     {
    	 int iA=Collections.frequency(a1, a1.get(i));//i=5,al.get(5)=hello,count=1,iA=1
    	
    	 if(!a2.contains(iA))
    	 {
    		 a2.add(iA);//a2=3,2,1
    	 }
     }
     Collections.sort(a1);//hello hi hi hi everyone everyone
     
     Collections.sort(a2);//1,2,3
    
     for(int i:a2)
     {
    	 for(int j=0;j< a1.size() ;j++)
    	 if(i == Collections.frequency(a1,a1.get(j)))//i=3,j=1,2,3,a1.get(1)=hi,hi count=3;
    	 {
    		 System.out.println(a1.get(j)+" ");//hello everyone everyone hi hi hi
    	 }
     }
	}

}
