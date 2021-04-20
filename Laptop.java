/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8assignment_q2;
public class Laptop  extends Computer{
    int length;
    int width;
    int height;
    double weight;
    
    public Laptop(){
    length=1;
    width=1;
    height=1;
    weight=1;
    }
    
    public Laptop(int length, int width , int height , double weight ,int wordSizeInBits,int memorySizeInMegaByte, int storageSizeInMegaByte, int speedInMegaHertz){
    super(wordSizeInBits,memorySizeInMegaByte,memorySizeInMegaByte,speedInMegaHertz);
    this.length=length;
    this.weight=weight;
    this.width=width;
    this.height=height;
    }
    
    public void Display(){
    super.Display();
        System.out.println("The length is: "+length +" \nThe width is:  "+width+"\nthe height is: "+height+"\nThe weight is: "+weight);
    }
}
