package Oops;
import java.util.*;
class Invoice{
    private String part_number;
    private String part_description;
    private int quantity;
    private double price;
    
    public Invoice(String part_number,String part_description,int quantity,double price)
    {
        this.part_number=part_number;
        this.part_description=part_description;
        this.quantity=quantity;
        this.price=price;

    }
    public void set_part_number(String part_number)
    {
        this.part_number=part_number;
    }
    public void set_part_description(String part_description)
    {
        this.part_description=part_description;
    }
    public void set_quantity(int quantity)
    {
        this.quantity=quantity;
    }
    public void set_price(double price)
    {
        this.price=price;
    }

    public String get_part_number()
    {
        return part_number;
    }
    public String get_part_description()
    {
        return part_description;
    }
    public int get_quantity()
    {
        return quantity;
    }
    public double get_price()
    {
        return price;
    }
    public double getInvoiceAmount()
    {
        return quantity*price;
    }

}
public class Invoiceque {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter part_no: ");
        String part_number=sc.next();
        System.out.println("Enter part_description: ");
        String part_description=sc.next();
        System.out.println("Enter quantity: ");
        int quantity=sc.nextInt();
        System.out.println("Enter price: ");
        double price=sc.nextDouble();

        Invoice iv=new Invoice(part_number,part_description,quantity,price);
        System.out.println();

        iv.set_part_number(part_number);
        iv.set_part_description(part_description);
        iv.set_quantity(quantity);
        iv.set_price(price);
        
        System.out.println("Part Number: "+iv.get_part_number());
        System.out.println("Part Description: "+iv.get_part_description());
        System.out.println("Quantity: "+iv.get_quantity());
        System.out.println("Price: "+iv.get_price());
        System.out.println("InvoiceAmount: "+iv.getInvoiceAmount());


    }
    
   

}



//i/p:
// Enter part_no:
// 1001
// Enter part_description:
// hardware
// Enter quantity:
// 2
// Enter price:
// 500

//op:
// Part Number: 1001
// Part Description: hardware
// Quantity: 2
// Price: 500.0
// InvoiceAmount: 1000.0