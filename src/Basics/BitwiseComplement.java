package Basics;

public class BitwiseComplement {
    
    public static void main(String args[])
    {
            int a=35;//00100100
        // 1's comp=>  11011011
        //2's  comp=>         1
        //-----------------------
        ///            11011100=> 220 | -36

        //Formula:-(N+1);
            int b=~a;//-(35+1)=>-36
            System.out.println(b);//-36
    }
}
