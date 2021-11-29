package Basics;
public class ParametrizedConstructor {
  
    String language;

    ParametrizedConstructor(String lang)
    {
        language=lang;//JAVA
        System.out.println(language+" is High level programming language");
    }

    public static void main(String args[])
    {
        ParametrizedConstructor obj=new ParametrizedConstructor("Java");

    }
}

/* 
OUTPUT

Java is High level programming language

*/