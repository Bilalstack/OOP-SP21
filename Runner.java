/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8assignment_q2;

/**
 *
 * @author Jawad
 */
public class Runner {
    public static void main(String[] args) {
       // Creating a instance of Computer class and directly passing arguments
        Computer computer=new Computer(4, 8, 500, 7);
        computer.Display();
      // Creating a instance of Laptop class and directly passing arguments  
        Laptop laptop=new Laptop(2,4,5,2.6,4,7,1000,8);
        laptop.Display();
    }
}
