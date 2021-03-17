import java.util.*;
public class Ascendingwordslengthremoveduplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		String sArr[]=s1.split(" ");
		ArrayList<String> al=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		
		for(int i=0;i<sArr.length;i++)
		{
			if(!al.contains(sArr[i]))
			{
				al.add(sArr[i]);
			}
		}
		int iArr[]=new int[al.size()];
		int k=0;
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String s2=itr.next().toString();
			//System.out.println(s2);
			iArr[k]=s2.length();
			k++;
		}
		Arrays.sort(iArr);
		for(int i=0;i<iArr.length;i++)
		{
			for(String s3:al)
			{
				if(s3.length()==iArr[i])
				{
					if(!al2.contains(s3))
					{
						System.out.print(s3+" ");
						al2.add(s3);
					}
				}
			}
		}
	}

}
