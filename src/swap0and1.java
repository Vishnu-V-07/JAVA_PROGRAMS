import java.util.*;
public class swap0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int iNum=sc.nextInt();
		
		ArrayList<Integer> al=new ArrayList<>();

		for(int i=0;i<iNum;i++)
		{
		
			al.add(sc.nextInt());
		}
		
       for(int i=0;i<iNum;i++)
       {
    	   if(al.get(i)==0)
    	   {  
    		   al.remove(i);
    		   al.add(0,0);
    		   
    		   
    	   }
	   }
    	   
		for(int i=0;i<iNum;i++)
		{
			System.out.print(al.get(i)+" ");
		}

       

	}

}
