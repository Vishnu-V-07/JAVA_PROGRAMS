import java.util.*;
public class InsertSortedlist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(2);
		ts.add(7);
		ts.add(5);
		ts.add(1);
		int iNum=sc.nextInt();
		ts.add(iNum);
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
