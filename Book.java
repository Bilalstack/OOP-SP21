/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8Assignment_Q1;

public class Book extends Publication {
    public int pageCount;
    
    public Book(int pageCount, String t, double p){
       super( t,  p);
        this.pageCount=pageCount;
     
    }

 
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void display(){
        System.out.println("Page count: "+this.pageCount);
        super.display();
     
    }
}
//