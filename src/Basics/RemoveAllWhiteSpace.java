package Basics;
public class RemoveAllWhiteSpace {
    

    public static void main(String args[])
    {
        String s1="    Hello     Java     ";
        String s2=s1.replaceAll("\\s","");//HelloJava

        System.out.println(s2);
    }
}


/*

OUTPUT:

HelloJava
 
 */
