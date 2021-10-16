package Basics;

public class LeftShiftOperator {

    public static void main(String args[])
    {
        int a=2;
        int b=a<<2;
        // 0 0 1 0
        // 0 1 0 0
        // 1 0 0 0==> o/p:8
        // 8 4 2 1

        //Another method
        //a<<2==> 
        //first shift
        //2*2=4
        //second shift
        //4*2=8

        System.out.println(b);//8
    }
    
}
