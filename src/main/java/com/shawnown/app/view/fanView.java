package com.shawnown.app.view;

public class fanView {
    public void showFanStatus(int speed, boolean direction){
        if(direction){
            if (speed==0){
                System.out.println("The fan is off "+"in Forward direction!");

            }
            else{
            System.out.println("The fan is working on speed "+speed+ " in Forward direction!");
            }
        }
        else{
            if (speed==0){
                System.out.println("The fan is off "+"in Backward direction!");

            }
            else{
            System.out.println("The fan is working on speed "+speed+ " in Backward direction!");
            }

        }
    }
}
