package Basics;
class LogicalOperators{

    public static void main(String args[])
    {
        int a =10;
        int b=5;
        int c=15;

        //&& Logical AND
        System.out.println((a>b)&&(c>a));//10>5 && 15>10=>true
        System.out.println((a>b)&&(c<a));//10>5 && 15<10=>false

        //|| Logical OR
        System.out.println((a>b)||(c>a));//10>5 || 15>10==>true
        System.out.println((a>b)||(c<a));//10>5 || 15<10==>true

        //! Not opreator
        System.out.println(!(a==c));//(10==15)==>!(false)=>true 
        System.out.println(!(a>b));//10>5==>!(true)=>false
        
    }
}


// true
// false
// true
// true
// true
// false