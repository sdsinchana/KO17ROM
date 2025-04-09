package com.xworkz.learningApp;

import com.xworkz.learningApp.Constants.Course;
import com.xworkz.learningApp.Constants.Payment;
import com.xworkz.learningApp.learning.Learning;
import com.xworkz.learningApp.learningdto.LearningDto;

public class LearningRunner {
    public static void main(String arg[]){

        LearningDto learningDto = new LearningDto();
        learningDto.setEmail("sinchana@gmail.com");
        learningDto.setName("Sinchana");
        learningDto.setPhnNo(7760749920L);
        learningDto.setPaymentType(Payment.online);
        learningDto.setCourseType(Course.java);

        Learning bank = new Learning();
        bank.User(learningDto);
        bank.fetchDetails();
    }
}
