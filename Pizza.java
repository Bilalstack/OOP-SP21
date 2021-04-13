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
public class Pizza {
  private String size;     
  private int numberOfCheeseTop;
  private int numberOfHamTop;
  private int numberOfPepperoniTop;
  
  Pizza(String size, int NumOfCheeseTop, int NumOfHamTop,  int NumOfPeproTop){
    this.size=size;
    numberOfCheeseTop=NumOfCheeseTop;
    numberOfHamTop=NumOfHamTop;
    numberOfPepperoniTop=NumOfPeproTop;
    
  }

   Pizza(String size, int numberOfCheeseTop, int numberOfPepperoniTop, int numberOfHamTop) 
   {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public String getSize(){
   return  size;
  }
  public void setSize(String s){
    size=s;
  }

    public int getNumberOfCheeseTop() {
        return numberOfCheeseTop;
    }

    public void setNumberOfCheeseTop(int numberOfCheeseTop) {
        this.numberOfCheeseTop = numberOfCheeseTop;
    }

    public int getNumberOfHamTop() {
        return numberOfHamTop;
    }

    public void setNumberOfHamTop(int numberOfHamTop) {
        this.numberOfHamTop = numberOfHamTop;
    }

    public int getNumberOfPepperoniTop() {
        return numberOfPepperoniTop;
    }

    public void setNumberOfPepperoniTop(int numberOfPepperoniTop) {
        this.numberOfPepperoniTop = numberOfPepperoniTop;
    }
    public double CalcCost(){
      if(this.size.equals("small")){
          return 10+ numberOfCheeseTop*2+numberOfHamTop*2+numberOfPepperoniTop*2; 
          
      }
      else if(this.size.equals("medium")){
          return 12+ numberOfCheeseTop*2+numberOfHamTop*2+numberOfPepperoniTop*2; 
          
      }
       else if(this.size.equals("large")){
          return 14+ numberOfCheeseTop*2+numberOfHamTop*2+numberOfPepperoniTop*2; 
            
    }
       else{
           
          System.out.println("Invalid option");
        return 0;   
       }
      }
    public String getDescription(){
    return "The size of pizza is "+size+" the quantity of Cheesetopping is"+numberOfCheeseTop+" the quantity of Hamtopping is"+numberOfHamTop+
            " and the quantity of pepperoniTopping is "+numberOfPepperoniTop;
    }
    
    
}
    

