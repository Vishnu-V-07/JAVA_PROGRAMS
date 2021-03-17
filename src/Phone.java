import java.util.*;
public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		//sc.next();
		ArrayList<String> list=new ArrayList<>();//number
		ArrayList<Integer>list1=new ArrayList<>();//money
		Map<String,Integer>map=new TreeMap<>();//num,money
		
		for(int i=0;i<N;i++)
		{
			String str=sc.next();
			String str1[]=str.split(",");
			String str2[]=str1[0].split(":");
			String val=String.valueOf(str1[1]);
			list.add(val);
			
			int hh=Integer.parseInt(String.valueOf(str2[0]));
			int mm=Integer.parseInt(String.valueOf(str2[1]));
			int ss=Integer.parseInt(String.valueOf(str2[2]));
			int pos=0;
			if(mm<5 && hh==0)
			{
				 pos+=((mm*60)+ss)*3;
				list1.add(pos);
				
				
			}
			else if(mm==5 && hh==0 && ss==0)
			{
				pos+=5*150;
				
				list1.add(pos);
				
			}
			else 
			{
				
						if(ss!=0)
						{
							mm=mm+1;
						}
						pos+=((hh*60)+mm)*150;
						list1.add(pos);
					//	map.put(val,pos);
			}
						
				if(map.containsKey(val))		
				{
					map.put(val,map.get(val)+pos);
				}
				else
				{
					map.put(val,pos);
				}
			
			
		}
//		Set<Map.Entry<String,Integer>> entries = map.entrySet();
//        for (Map.Entry<String,Integer> entry : entries) {
//      String code = entry.getKey();
//       Integer language = entry.getValue();
//        System.out.println(code + " => " + language);
//        }
		int sum=0;
		for(int i=0;i<list1.size();i++)
		{
			sum+=list1.get(i);
		}
		System.out.println(sum);
		int sum1=0;
		int min=0;
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
		if(map.get(list.get(i))<min)
				{
			
			 map.remove(list.get(i));
			
				}
		else
		{
			
			
			 sum1+=map.get(list.get(i));
			 min=map.get(list.get(i));
			 break;
			 
		}
		}
		
		
		//System.out.println(sum1);
       
		System.out.println(sum-sum1);
		
       
        
	}

}

