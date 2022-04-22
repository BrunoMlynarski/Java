package com.company.homework.schedule;

import com.company.homework.tictactoe.GameMode;

import java.util.InputMismatchException;
import java.util.Scanner;

class MetodsProgram {
    static UserOptions collectionAndChoosenUserOption() {
        Scanner userOptionScan = new Scanner(System.in);
        int choosenUserOption = 0;
        while (true) {
            try {
                choosenUserOption = userOptionScan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please choose again game mode.");
                userOptionScan.next();
            }
            if (choosenUserOption == 1) {
                return UserOptions.ADD;
            }
            else if (choosenUserOption == 2) {
                return UserOptions.EDIT;
            }
            else if (choosenUserOption == 3) {
                return UserOptions.REMOVE;
            }
            else if (choosenUserOption == 4) {
                return UserOptions.VIEW;
            }
        }
    }

    void addNewVehicletoSchedule(){

    }

}