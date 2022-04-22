package com.company.homework.schedule;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class DataBaseOfScheduledVehicles {
  Map<Integer, String> dataBaseOfScheduledVehicles = new HashMap<>();

  void addNewVehicleToSchedule(int vehicleNumber, String vehicleDepartureTime){
    dataBaseOfScheduledVehicles.put(vehicleNumber, vehicleDepartureTime);
  }
  void editingTheVehicleFromTheSchedule(int editedOfTheNumberVehicle, String editTime){
    dataBaseOfScheduledVehicles.replace(editedOfTheNumberVehicle,editTime);
  }
}
