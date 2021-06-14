package Oops;
import java.util.*;
public class Triangle {
   static int side1,side2,side3;
    Triangle()
    {
        int perimeter=side1+side2+side3;
        System.out.println(perimeter);
    }
    Triangle(int side1,int side2,int side3)
    {
        int perimeter=side1+side2+side3;
        System.out.println(perimeter);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         
        side1=sc.nextInt();
        side2=sc.nextInt();
        side3=sc.nextInt();
        Triangle t=new Triangle();
        Triangle t2=new Triangle(side1,side2,side3);
        //  t.side1=sc.nextInt();
        //  t.side2=sc.nextInt();
        //  t.side3=sc.nextInt();
        //   Triangle(side1,side2,side3);
        
    }
    
}
