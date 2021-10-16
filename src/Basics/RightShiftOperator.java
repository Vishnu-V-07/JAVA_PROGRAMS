package Basics;

public class RightShiftOperator {

    public static void main(String args[])
    {
        int a=8;
        int b=a>>2;
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0==> o/p:2
        // 8 4 2 1

        //Another method
        //a>>2==> 
        //first shift
        // 8/2=4
        //second shift
        // 4/2=2

        System.out.println(b);//2
    }
    
}
