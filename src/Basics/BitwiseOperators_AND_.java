package Basics;
public class BitwiseOperators_AND_ {
    
    public static void main(String args[])
    {
       int a=12;// 16 8 4 2 1
                //  0 1 1 0 0 ===>12
       int b=25;// 16 8 4 2 1
                //  1 1 0 0 1 ===>25

       int c= a & b;

       //TRUTH TABLE AND
       // A    B         A&B
       // 0    0         0
       // 0    1         0
       // 1    0         0
       // 1    1         1

       //To perform bitwise AND
      // 0 1 1 0 0 ===>12
      // 1 1 0 0 1 ===>25
      //------------
      // 0 1 0 0 0 ===>8

      //16 8 4 2 1


      System.out.println(c);//8

    }
}
