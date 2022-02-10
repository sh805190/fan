package com.shawnown.app.controller;

import com.shawnown.app.model.fan;
import com.shawnown.app.view.fanView;

public class fanController {
    private fan model;
    private fanView view;

    public fanController(fan model,fanView view){
        this.model=model;
        this.view=view;
    }

    public void setFan() {
        model.setSpeed(0);
        model.setDirection(true);
    }
    public int getFanSpeed(){
        return model.getSpeed();
    }
    public boolean getFanDirection(){
        return model.getDirection();
    }
    //speed up fan
    public void speedUp(){
        if(getFanSpeed()==3){
            model.setSpeed(0);
        }
        else{
            model.setSpeed(getFanSpeed()+1);
        }
    }
    //reverse fan
    public void reverseDirection(){
        model.setDirection(!getFanDirection());
    }
    public void updateView(){
        view.showFanStatus(getFanSpeed(), getFanDirection());
    }
}
