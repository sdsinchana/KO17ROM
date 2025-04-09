package com.xworkz.carcontrolapp;

import com.xworkz.CarControl;
import com.xworkz.controlapp.constants.ControlMode;

public class CarControlRunner {
    public static void main(String[] args) {


        CarControlDto dto = new CarControlDto();
        dto.setCarModel("Tesla Model S");
        dto.setLicensePlate("KA-05-1234");
        dto.setOwnerName("Akhil Raj");
        dto.setContactNumber("9876543210");
        dto.setEngineStatus(true);
        dto.setFuelLevel(85.5);
        dto.setSpeed(60.0);
        dto.setControlMode(ControlMode.AUTOMATIC);


        CarControl control = new CarControl();
        control.startControl(dto);
        control.fetchDetails();
    }
}

