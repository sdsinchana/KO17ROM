package com.xworkz.gymapp.fitnesscenter;

import com.xworkz.gymapp.GymManager.GymManager;
public class FitnessCenter {
    public int centerId;
    public String centerName;
    public GymManager manager;

    public void fetchDetails(){
        System.out.println("Fitness Center ID is " + centerId);
        System.out.println("Fitness Center Name is " + centerName);
        System.out.println("Manager details are: ");
        manager.getDetails();
    }
}

