package Basics;
public class BitwiseOperators_OR_ {
    
    public static void main(String args[])
    {
       int a=12;// 16 8 4 2 1
                //  0 1 1 0 0 ===>12
       int b=25;// 16 8 4 2 1
                //  1 1 0 0 1 ===>25

       int c= a|b;

       //TRUTH TABLE OR
       // A    B         A|B
       // 0    0         0
       // 0    1         1
       // 1    0         1
       // 1    1         1

       //To perform bitwise OR
      // 0 1 1 0 0 ===>12
      // 1 1 0 0 1 ===>25
      //------------
      // 1 1 1 0 1 ===>29

      //16 8 4 2 1=


      System.out.println(c);//29

    }
}
