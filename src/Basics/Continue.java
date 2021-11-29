package Basics;
public class Continue {

    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            if(i>5 && i<9)
            {
                continue;
            }
            System.out.println(i);
        }
        
    }
    
}

// 1
// 2
// 3
// 4
// 5
// 9
// 10