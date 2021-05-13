package Collections;
import java.util.*;
public class BalanceParenthesis {
    public static boolean isBalance(String s1)
    {
        Stack<Character> st=new Stack<Character>();
        char b='0';
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='{' || c=='[' || c=='(')
            {
                st.push(c);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                    
                }
                else
                {
                    
                    b=st.peek();
                    if((b=='{' && c=='}') || (b=='[' && c==']') || (b=='(' && c==')'))
                    {
                        st.pop();
                    }
                    b='0';
                }
            }
           
        }
        if(st.isEmpty())
        {
            return true;
            
        }
        return false;
        
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        String sarr[]=new String[iNum];
        for(int i=0;i<iNum;i++)
        {
            sarr[i]=sc.next();
        }
        for(int i=0;i<iNum;i++)
        {
            String s1=sarr[i];
            if(s1.length()%2==0)
            {
                if(isBalance(s1))
                {
                    System.out.println("Balanced");
                }
                else{
                    System.out.println("Unbalanced");
                }
            }
            else{
                System.out.println("Unbalanced");
            }
            s1="";
        }
    }
    
}

// I/P:
// 7
// {}()
// [{()}]
// ({()})
// {}{
// ({)}
// [[
// }{

// OP:
// Balanced
// Balanced
// Balanced
// Unbalanced
// Unbalanced
// Unbalanced
// Unbalanced