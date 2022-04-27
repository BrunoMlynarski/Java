package com.company.homework.schedule;

import java.util.HashMap;
import java.util.Map;

class DataBaseOfScheduledVehicles {
  private static DataBaseOfScheduledVehicles instance;
  private Map<Integer, String> dataBaseOfScheduledVehicles;

  private DataBaseOfScheduledVehicles(Map<Integer, String> dataBaseOfScheduledVehicles) {
    this.dataBaseOfScheduledVehicles = dataBaseOfScheduledVehicles;
  }

  static DataBaseOfScheduledVehicles getInstance() {
    if (instance == null) {
      instance = new DataBaseOfScheduledVehicles(new HashMap<>());
    }
    return instance;
  }

  void addNewVehicleToSchedule(int vehicleNumber, String vehicleDepartureTime) {
    dataBaseOfScheduledVehicles.put(vehicleNumber, vehicleDepartureTime);
  }

  void editingTheVehicleFromTheSchedule(int editedOfTheNumberVehicle, String editTime) {
    dataBaseOfScheduledVehicles.replace(editedOfTheNumberVehicle, editTime);
  }

  void removedTheVehicleFromTheSchedule(int theVehicleNumberToBeRemoved) {
    dataBaseOfScheduledVehicles.remove(theVehicleNumberToBeRemoved);
  }
  int databaseSize() {
    return dataBaseOfScheduledVehicles.size();
  }

  void printSchedule(){
    Displays.viewScheduleHeaderMessage();
    for (Map.Entry<Integer, String> entry : dataBaseOfScheduledVehicles.entrySet()) {
      System.out.println("Vehicle number: " + entry.getKey() + " departure time: " + entry.getValue());
    }
}
}
