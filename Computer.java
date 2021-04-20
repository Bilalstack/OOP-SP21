/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8assignment_q2;


public class Computer {
int wordSizeInBits;
int memorySizeInMegaByte;
int storageSizeInMegaByte;
int speedInMegaHertz;
public Computer(){
    this.wordSizeInBits=4;
    this.storageSizeInMegaByte=250;
    this.memorySizeInMegaByte=4;
    this.speedInMegaHertz=4;
    }
public Computer(int wordSizeInBits,int memorySizeInMegaByte, int storageSizeInMegaByte, int speedInMegaHertz ){
this.wordSizeInBits=wordSizeInBits;
this.memorySizeInMegaByte=memorySizeInMegaByte;
this.storageSizeInMegaByte=storageSizeInMegaByte;
this.speedInMegaHertz=speedInMegaHertz;
}

public void Display(){
    System.out.println("Word size in bits is: "+wordSizeInBits+"\nmemory size in mega byte is: "+memorySizeInMegaByte+ "\n Storage size in mega byte is: "+
           +storageSizeInMegaByte +"\n Storage size in mega byte is: " +speedInMegaHertz);
}

    
}
