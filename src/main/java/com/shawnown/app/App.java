package com.shawnown.app;

import java.util.Scanner;

import com.shawnown.app.controller.fanController;
import com.shawnown.app.model.fan;
import com.shawnown.app.view.fanView;


public class App {
    public static void main(String[] args) {
        fan model = new fan();
        fanView view = new fanView();
        fanController controller = new fanController(model, view);
        controller.setFan();
        controller.updateView();

        boolean flag = true;
        while (flag) {
            Scanner user = new Scanner(System.in);
            System.out.println("1. Speed Up the Fan.");
            System.out.println("2. Reverse the Fan.");
            System.out.println("3. Turn off the Fan.");

            String option = user.next();

            if (option.equals("1")) {
                controller.speedUp();
            } else if (option.equals("2")) {
                controller.reverseDirection();

            } else if (option.equals("3")) {
                user.close();
                flag=false;
            } else {

                System.out.println("Please Choose correct options!");
            }
            controller.updateView();
        }
    }
}
