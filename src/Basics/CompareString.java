package Basics;
public class CompareString {

    public static void main(String args[])
    {
        String s1="hi";
        String s2="hello";
        String s3="hello";
        boolean b1=s1.equals(s2);//false
        boolean b2=s2.equals(s3);//true
        System.out.println("Is Strings s1 and s2 are equal ? "+b1);
        System.out.println("Is Strings s2 and s3 are equal ? "+b2);
        
        
    }
    
}


/*

OUTPUT

Is Strings s1 and s2 are equal ? false
Is Strings s2 and s3 are equal ? true

*/ 
