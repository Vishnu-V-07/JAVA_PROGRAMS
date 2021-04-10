import java.util.*;
public class TelephoneProblem {

	public static void main(String[] args)
	 {
		
	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		String v[]=new String[iNum];
		String numarray[]=new String[iNum];
		int dup[]=new int[iNum];

		int d[]=new int[iNum];
		//sc.next();3
		int totalsum=0;
		for(int i=0;i<iNum;i++)
		{
			
			v[i]=sc.next();
		}
		for(int i=0;i<v.length;i++)
		{
			String s1=v[i];
		    
			String sArr[]=s1.split(",");
	       // System.out.println(Arrays.toString(sArr));

			String s3="";
			int i1=0;
			int i2=0;
			int sum=0;
			int total=0;
			Map<String,String> hm=new HashMap<>();
	            String time = sArr[0];
	           // System.out.println(time);
	            String num =sArr[sArr.length-1]; 
	           // System.out.println(num);
	            numarray[i]=num;
	            
	            hm.put(num, time);
//	            if(hm.containsKey(num))
//	            {
//	            	hm.put(num, hm.get(num)+)
//	            }
	            
	       
	        s3=time;
	        String a2[]=s3.split(":");
	        sum=0;
         //   System.out.println(Arrays.toString(a2));
	        for(int j=0;j<a2.length;j++)
	        {

	        	
	        	if(j==1)
	        	{
				

	        		i1=Integer.parseInt(a2[j]);
	        		if(i1<5)
	        		{
	        			sum+=(i1*60);
	        		}
	        		else if(i1>=5)
	        		{
	        			sum+=(i1);
	        		}
	        	}
	        	if(j==2)
	        	{
	        		i2=Integer.parseInt(a2[j]);
	        		if(i1<5)
	        		{
	        			sum+=i2;
		    	        total=sum*3;

	        		}
	        		else if(i1>=5)
	        		{
	        			sum+=i2;
		    	        total=sum*150;

	        		}

	        		
	        	}
	        	
	        }
	        //System.out.println("Bill:"+total);
	        d[i]+=total;


		}
		for(int j=0;j<d.length;j++)
		{
			dup[j]=d[j];
		}
		Arrays.sort(d);
		System.out.println(Arrays.toString(d)); 
		for(int i=0;i<d.length;i++)
		{
			totalsum+=d[i];
		}
		System.out.println(totalsum);
		//System.out.println("Bill:"+d[d.length-1]);
		int greatest=d[d.length-1];
		System.out.println(greatest);

		totalsum-=greatest;
		System.out.println(totalsum);
		Map<String,Integer> hm1=new HashMap<>();
		for(int j=0;j<d.length;j++)
		{
			hm1.put(numarray[j], dup[j]);
		}
		for (Map.Entry<String,Integer> entry : hm1.entrySet())
		{//using map.entrySet() for iteration  
			
		}


		


	}

}
