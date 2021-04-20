/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8Assignment_Q1;

/**
 *
 * @author Jawad
 */
public class Publication {
 String title;
 private double price;
 
 public Publication(String title,double price){
   this.title=title;
   this.price=price;
 
 }
 
 public void setTitle(String t){
 title=t;
 }
 public String getTitle(){
 return title;
 }

    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void display(){
        System.out.println("The Title is"+title+" and price is "+price);
 
    }
 
    
}
