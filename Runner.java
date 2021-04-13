/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author HP-_
 */
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of pizza");
        String size=sc.nextLine();
        System.out.println("Enter the quantity of CheeseToping");
        int numberOfCheeseTop=sc.nextInt();
         System.out.println("Enter the quantity of Pepperonitopping");
         int numberOfPepperoniTop=sc.nextInt();
         System.out.println("Enter the quantity of Hamtopping");
         int numberOfHamTop=sc.nextInt();
        Pizza p1=new Pizza(size,numberOfCheeseTop,numberOfPepperoniTop,numberOfHamTop);
         p1.getDescription();
           System.out.println("Total Bill is $"+p1.CalcCost());
          System.out.println("Enter the size of pizza");
          String size2=sc.next();
        System.out.println("Enter the quantity of CheeseToping");
        int numberOfCheeseTop2=sc.nextInt();
         System.out.println("Enter the quantity of Pepperonitopping");
         int numberOfPepperoniTop2=sc.nextInt();
         System.out.println("Enter the quantity of Hamtopping");
         int numberOfHamTop2=sc.nextInt();
        Pizza p2=new Pizza(size2,numberOfCheeseTop2,numberOfPepperoniTop2,numberOfHamTop2);
         p2.getDescription();
         System.out.println("Total Bill is $"+p2.CalcCost());
            System.out.println("Enter the size of pizza"); 
         String size3=sc.next();
         
        System.out.println("Enter the quantity of CheeseToping");
        int numberOfCheeseTop3=sc.nextInt();
         System.out.println("Enter the quantity of Pepperonitopping");
         int numberOfPepperoniTop3=sc.nextInt();
         System.out.println("Enter the quantity of Hamtopping");
         int numberOfHamTop3=sc.nextInt();
        Pizza p3=new Pizza(size3,numberOfCheeseTop3,numberOfPepperoniTop3,numberOfHamTop3);
         p3.getDescription();
         System.out.println("Total Bill is $"+p3.CalcCost());
         PizzaOrder po1=new PizzaOrder(p1);
         po1.setPizzaOrder(p2);
         po1.setPizzaOrder(p3);
        
        double total=po1.caltotal();
         System.out.println("Total Bill is given as $"+total);
    
    
    }
}
    
