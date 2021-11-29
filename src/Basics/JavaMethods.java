package Basics;

//UserDifined Methods


/*
 Syntax for declaring method:

 returntype methodName()
 {
   method body
 }

 */

/*

 Calling a method in java

 syntax:

 objName.methodName();
 */

 


public class JavaMethods {

     int add(int a,int b)//20 30
    {
        int c=a+b;//20+30=50
        return c;
    }
    public static void main(String args[])
    {
        int a=20;
        int b=30;
        JavaMethods obj=new JavaMethods();
        int result=obj.add(a,b);//50
        System.out.println("The sum is "+result);
    }
}


//The sum is 50