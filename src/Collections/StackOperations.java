package Collections;
import java.util.*;
public class StackOperations {
    
    public static void toPush(int b,Stack<Integer> st)
    {
        st.push(b);
        System.out.println(st);
    }
    public static void toPop(Stack<Integer> st)
    {
        st.pop();
    }
    public static void toMax(Stack<Integer> st)
    {
        int max=0,temp=0;
        for(int i:st)
        {
            temp=i;
            System.out.println(temp);
            if(temp>max)
            {
                max=temp;
            }
        }
        System.out.println(max);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<iNum;i++)
        {
            int a=sc.nextInt();
            int b=0;
            if(a==1)
            {
                b=sc.nextInt();
                
            }
            else{
                int c=sc.nextInt();
                if(c==1)
                {
                    toPush(b,st);
                }
                if(c==2)
                {
                    toPop(st);
                }
                if(c==3)
                {
                    toMax(st);
                }
                
            }

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