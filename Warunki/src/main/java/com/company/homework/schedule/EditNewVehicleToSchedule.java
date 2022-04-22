package com.company.homework.schedule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EditNewVehicleToSchedule {

    static void startAdd(DataBaseOfScheduledVehicles dataBaseOfScheduledVehicles) {
        Displays.editVehicleMessage();//print message
        Displays.theNumberOfTheEditedVehicleMessage();//print message
        int editedOfTheNumberVehicle  = takingEditedOfTheNumberVehicleFromUser();//taking value to variable from user
        Displays.newDepartureTimeOfTheEditedVehicleMessage();//print message
        String editTime = takingEditDepartureTimeFromUser();//taking value to variable from user

        editingTheVehicleFromTheSchedule(dataBaseOfScheduledVehicles, editedOfTheNumberVehicle ,editTime);//add new vehicle to map
        Displays.newVehicleIsAddCorrectMessage();// print message
    }

    private static void editingTheVehicleFromTheSchedule(DataBaseOfScheduledVehicles dataBaseOfScheduledVehicles, int editedOfTheNumberVehicle, String editVehicleDepartureTime) {
        dataBaseOfScheduledVehicles.editingTheVehicleFromTheSchedule(editedOfTheNumberVehicle, editVehicleDepartureTime);
    }

    private static int takingEditedOfTheNumberVehicleFromUser() {
        Scanner editedOfTheNumberVehicleScan = new Scanner(System.in);
        while (true) {
            try {
                int editedOfTheNumberVehicle = editedOfTheNumberVehicleScan.nextInt();
                return editedOfTheNumberVehicle;
            } catch (InputMismatchException e) {
                System.out.println("Please choose again game mode.");
                editedOfTheNumberVehicleScan.next();
            }


        }
    }
    private static String takingEditDepartureTimeFromUser() {
        Scanner editDepartureTimeScan = new Scanner(System.in);
        while (true) {
            try {
                String editVehicleDepartureTime = editDepartureTimeScan.nextLine();
                return editVehicleDepartureTime;
            } catch (InputMismatchException e) {
                System.out.println("Please choose again game mode.");
                editDepartureTimeScan.next();
            }


        }
    }
}
