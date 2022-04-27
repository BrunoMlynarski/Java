package com.company.homework.schedule;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DataBaseOfScheduledVehicles database = DataBaseOfScheduledVehicles.getInstance();
        Displays.welcome();

       MainMenu startMain = new MainMenu();
       while (true) {
           startMain.startMain(database);

       }
//napisać to w pętli


    }
}
