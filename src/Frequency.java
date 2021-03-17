import java.util.*;
public class Frequency {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     String sArr[]=s1.split(" ");
     ArrayList<String> a1=new ArrayList<>();
     ArrayList<Integer> a2=new ArrayList<>();
     for(int i=0;i<sArr.length;i++)
     {
    	 a1.add(sArr[i]);
     }
     for(int i=0;i<a1.size();i++)
     {
    	 int iA=Collections.frequency(a1, a1.get(i));
    	
    	 if(!a2.contains(iA))
    	 {
    		 a2.add(iA);
    	 }
     }
     Collections.sort(a1);
     Collections.sort(a2);	
     for(int i:a2)
     {
    	 for(int j=0;j<a1.size();j++)
    	 if(i == Collections.frequency(a1,a1.get(j)))
    	 {
    		 System.out.println(a1.get(j)+" ");
    	 }
     }
	}

}
