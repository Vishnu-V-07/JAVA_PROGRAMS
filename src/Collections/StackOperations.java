package Collections;
import java.util.*;
public class StackOperations {
    
    public static void toPush(int b,Stack<Integer> st)
    {
        st.push(b);
      
    }
    public static void toPop(Stack<Integer> st)
    {
        st.pop();
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<iNum;i++)
        {
            int a=sc.nextInt();
          
            int max=0;
            if(a==1)
            {
               int b=sc.nextInt();
                toPush(b,st);
                
            }
            else if(a==2)
            {
                toPop(st);
            }
            else if(a==3)
            {
                int c=Collections.max(st);
                al.add(c);

            }
            

        }
        System.out.println();
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
    
}


//I/P:
// 10
// 1 97
// 2
// 1 20
// 2
// 1 26
// 1 20
// 2
// 3
// 1 91
// 3

// O/P:
// 26
// 91