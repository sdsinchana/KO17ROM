package com.xworkz.gymapp;

import com.xworkz.gymapp.GymManager.GymManager;
import com.xworkz.gymapp.fitnesscenter.FitnessCenter;
import com.xworkz.gymapp.trainer.Trainer;

public class FitnessCenterRunner {
    public static void main(String[] args) {
        FitnessCenter fitnessCenter = new FitnessCenter();
        fitnessCenter.centerId = 1;
        fitnessCenter.centerName = "Bons Gym";

        GymManager gymManager = new GymManager();
        gymManager.managerId = 1;
        gymManager.managerName = "Sinchana";

        String[] trainerNamesList1 = {"naveen", "prathap", "Sam"};
        String[] trainerNamesList2 = {"vandhana", "peter"};
        Trainer[] trainers = new Trainer[2];

        Trainer trainer1 = new Trainer();
        trainer1.trainerId = 1;
        trainer1.trainerNames = trainerNamesList1;
        trainers[0] = trainer1;

        Trainer trainer2 = new Trainer();
        trainer2.trainerId = 2;
        trainer2.trainerNames = trainerNamesList2;
        trainers[1] = trainer2;

        gymManager.trainers = trainers;
        fitnessCenter.manager = gymManager;

        fitnessCenter.fetchDetails();
    }
}
