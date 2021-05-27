package Oops;
import java.util.*;
class Circle{
    private double radius=1.0;
    private String color="red";
    
    Circle()
    {
       String color="red";
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public void setRadius()
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        double area=(Math.PI)*radius*radius;
        return area;
    }
    public double getCircumference()
    {
        
        double circumference=2*(Math.PI)*radius;
        return circumference;
    }
}
public class Circle1 {
    public static void main(String args[])
    {
        double radius=1.0;
        Circle c=new Circle();
        c.setRadius();
        System.out.println("radius is: "+c.getRadius());
        double d=c.getArea();
        float a=(float)d;
        String s1=String.format("%3.2f",a);
        double e=c.getCircumference();
        float b=(float)e;
        String s2=String.format("%3.2f",b);
        System.out.println("area is: "+s1);
        System.out.println("circumference is: "+s2);


    }

    
    
}
