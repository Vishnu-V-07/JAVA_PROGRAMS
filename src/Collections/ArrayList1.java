package Collections;
import java.util.*;
public class ArrayList1 {
    ArrayList<Integer> A1=new ArrayList<>();
    ArrayList<Integer> A2=new ArrayList<>();

    public  ArrayList<Integer> saveEvenNumbers(int N)
    {
        for(int i=1;i<=N;i++)
        {
            if(i%2==0)
            {
                A1.add(i);
            }
        }
        return A1;
    }
    public ArrayList<Integer> doubleEvenNumbers(int N)
    {
        for(int i=0;i<A1.size();i++)
        {
            A2.add(A1.get(i)*2);
        }
        return A2;
    }
    public  int checkNumber(int N)
    {
        int flag=0;
        for(int i=0;i<A1.size();i++)
        {
            if(A1.get(i)==N)
            {
                flag=N;
                break;
            }
            else{
                flag=0;
            }
        }
        return flag;
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         ArrayList1 a=new ArrayList1();
         System.out.println(a.saveEvenNumbers(N));
         System.out.println(a.doubleEvenNumbers(N));
         System.out.println("Enter the element to search");
         int search=sc.nextInt();
         System.out.println(a.checkNumber(search));
         sc.close();
         
    }
    
}
