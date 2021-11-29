package Basics;
public class ConcatStrings {

    public static void main(String args[])
    {
        String s1="hi";
        String s2="hello";
        String s3="Welcome";
        String s4=s1.concat(s2);//hihello
        String s5=s4.concat(s3);//hihelloWelcome
        System.out.println(s1+s2+s3);//hihelloWelcome
        System.out.println(s5);
        
    }
    
}


/*

OUTPUT

hihelloWelcome
hihelloWelcome

*/ 
