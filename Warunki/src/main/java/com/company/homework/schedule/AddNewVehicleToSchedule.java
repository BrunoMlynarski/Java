package com.company.homework.schedule;

import javax.management.StringValueExp;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class AddNewVehicleToSchedule {

    static void startAdd(DataBaseOfScheduledVehicles dataBaseOfScheduledVehicles){
        Displays.addNewVehicleMessage();//print message
        Displays.addNumberVehicleMessage();//print message
        int number = takingNumberFormUser();//taking value to variable from user
        Displays.addDepartureTimeVehicleMessage();//print message
        String time = takingDepartureTimeFormUser();//taking value to variable from user
        addNewVehicleToSchedule(dataBaseOfScheduledVehicles,number, time);//add new vehicle to map
        Displays.newVehicleIsAddCorrectMessage();// print message
    }

    private static void addNewVehicleToSchedule(DataBaseOfScheduledVehicles dataBaseOfScheduledVehicles, int vehicleNumber, String vehicleDepartureTime){
        dataBaseOfScheduledVehicles.addNewVehicleToSchedule(vehicleNumber, vehicleDepartureTime);
    }
      private static int takingNumberFormUser(){
         Scanner numberScan = new Scanner(System.in);
         while (true) {
             try {
                 int vehicleNumber = numberScan.nextInt();
                 return vehicleNumber;
             } catch (InputMismatchException e) {
                 System.out.println("Please choose again game mode.");
                 numberScan.next();
             }
         }
     }
     private static String takingDepartureTimeFormUser(){
        Scanner departureTimeScan = new Scanner(System.in);
        while (true) {
            try {
                String vehicleDepartureTime = departureTimeScan.nextLine();
                return vehicleDepartureTime;
            } catch (InputMismatchException e) {
                System.out.println("Please choose again game mode.");
                departureTimeScan.next();
            }
        }
    }

}
