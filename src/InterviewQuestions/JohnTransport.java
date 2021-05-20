package InterviewQuestions;
import java.util.*;
public class JohnTransport {

    public static void MinimumEven(int arr[],int iNum,int s)
    {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<s;i++)
        {
            int b=arr[i];
            if(b%2==0)
            {
                al.add(arr[i]);
            }
        }
        for(int i=al.size()-1;i>=0;i--)
        {
            if(iNum>0)
            {
               al2.add(al.get(i));
                iNum--;
            }
            else
            {
                break;
            }
        }
        Collections.sort(al2);
        for(int i=0;i<al2.size();i++)
        {
            System.out.println(al2.get(i));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        MinimumEven(arr,iNum,s);
    }
    
}
// 2
// 5
// 10 23 44 56 43
// 44
// 56