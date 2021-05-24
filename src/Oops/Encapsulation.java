package Oops;
import java.util.*;
class College
{
    private String name;
    private String mail;
    private String regno;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getStudentMail()
    {
        return mail;
    }
    public void setStudentMail(String mail)
    {
        this.mail=mail;
    }
    public String getRegNo()
    {
        return regno;
    }
    public void setRegNo(String regno)
    {
        this.regno=regno;
    }
}
public class Encapsulation {
    public static void main(String args[])
    {
        College clg=new College();
        clg.setName("SIET");
        clg.setStudentMail("vishnuv20@siet.ac.in");
        clg.setRegNo("714018106076");
        System.out.println(clg.getName());
        System.out.println(clg.getStudentMail());
        System.out.println(clg.getRegNo());
    }
}
