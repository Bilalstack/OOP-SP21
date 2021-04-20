/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8Assignment_Q1;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the page count of book ");
     int pageCount=sc.nextInt();
        System.out.println("Enter the title of a book ");
       String title=sc.next();
        System.out.println("Enter the price of a book ");
        double price=sc.nextDouble();
        
        
        
        Book book=new Book(pageCount,title,price);
        book.display();
        
        
        System.out.println("Enter the title ");
        String title1=sc.next();
        System.out.println("Enter the price of a tape ");
        double price1=sc.nextDouble();
        System.out.println("Enter the duration of tape ");
        int time=sc.nextInt();
        
        Tape tape=new Tape(title1, price1, time);
        tape.display();

        
        
    }
}
