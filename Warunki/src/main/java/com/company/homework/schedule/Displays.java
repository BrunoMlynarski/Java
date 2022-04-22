package com.company.homework.schedule;

public class Displays {
    static void welcome(){
        System.out.println("Welcome to the schedule system!");
    }
    static void viewOptions(){
        System.out.println("Choose a option.");
        System.out.println("1: Add new vehicle.");
        System.out.println("2: Edit vehicle.");
        System.out.println("3: Remove vehicle.");
        System.out.println("4: View schedule.");
    }

    //Add new vehicle to schedule
    static void addNewVehicleMessage(){
        System.out.print("To add a new one, you need to enter its number and departure time.");
    }
    static void addNumberVehicleMessage(){
        System.out.println("Enter vehicke number.");
    }
    static void addDepartureTimeVehicleMessage(){
        System.out.println("Enter vehicle departure time.");
    }
    static void newVehicleIsAddCorrectMessage() {
        System.out.println("The new vehicle has been added correctly.");
    }

    //Edit vehicle from schedule
    static void editVehicleMessage(){
        System.out.println("To edit vehicle from schedule, you want to edit and enter a new number and departure time.");
    }
    static void theNumberOfTheEditedVehicleMessage(){
        System.out.println("Enter the number of the edited vehicle.");
    }
    static void newNumberOfTheEditedVehicleMessage(){
        System.out.println("Enter a new number of the edited vehicle.");
    }
    static void newDepartureTimeOfTheEditedVehicleMessage(){
        System.out.println("Enter a new departure time of the edited vehicle.");
    }
    static void theVehicleIsEditedCorrect(){
        System.out.println("The vehicle is edited correct.");
    }

}
