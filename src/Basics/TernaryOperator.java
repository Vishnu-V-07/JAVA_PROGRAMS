package Basics;
class TernaryOperator
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        String c=(a>b)?"A is Greater":"B is Greater";
        System.out.println(c);//B is Greater
    }
    
}

//Syntax:
//variable =condition?statement 1:statement 2