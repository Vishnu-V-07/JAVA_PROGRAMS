package Basics;
public class DataTypes
{
    public static void main(String args[])
    {
        //Primitive Datatypes
        byte a= 100;//size:1 byte ,range:-128 to 127
        short b= 5000;//size:2 bytes,range:-32768 to 32767
        int c=5;//size:4 bytes;
        long d=15000000000000l;//size:8 bytes;
        float e= 5.923456f;//size:4 bytes; sufficient to store 6 to 7 decimal digits
        double f=19.99999999999999;//size:8 bytes;sufficient to store 15 decimal digits
        boolean g=true;//1 bit,Stores true or false value
        char h='1';//size:2 bytes ; stores a single character/letter or Ascii values

        //Non primitive Datatypes

        String i="Hello World";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);


    }
}

// O/P:
// 100
// 5000
// 5
// 15000000000000
// 5.923456
// 19.99999999999999
// true
// 1
// Hello World