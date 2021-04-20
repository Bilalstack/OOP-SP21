/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8Assignment_Q1;

public class Tape extends Publication{
 private int playingTimeInMinutes;  

    public Tape(String title, double price, int timeInMinute) {
        super(title, price);
        playingTimeInMinutes=timeInMinute;
    }

    public int getPlayingTimeInMinutes() {
        return playingTimeInMinutes;
    }

   
    public void setPlayingTimeInMinutes(int playingTimeInMinutes) {
        this.playingTimeInMinutes = playingTimeInMinutes;
    }
    
    public void display(){
    super.display();
        System.out.println("playing time in minutes is "+playingTimeInMinutes);
    }
}
