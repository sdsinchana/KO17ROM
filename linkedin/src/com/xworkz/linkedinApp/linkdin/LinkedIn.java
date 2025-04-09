package com.xworkz.linkedinApp.linkdin;

import com.xworkz.linkedinApp.linkdindto.LinkdinDto;

public class LinkedIn {
    LinkdinDto dto;
    public  boolean User(LinkdinDto linkdinDto) {
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(linkdinDto);
        if (uservalid){
            dto = linkdinDto;
            isUserRegisterd = true;
        System.out.println("Registered successfully");
    }
        else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(LinkdinDto linkdinDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isSoftware = false;
        boolean isEducation = false;

        if(linkdinDto.getEmail()!=null){
            isEmail = true;
        }
        if(linkdinDto.getName()!=null){
            isName = true;
        }
        if(linkdinDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(linkdinDto.getSoftwareskills()!=null){
            isSoftware = true;
        }
        if(linkdinDto.getEduaction()!=null){
            isEducation = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isSoftware == true && isEducation == true)
            isUserValidated = true;

        return isUserValidated;
    }
    public void fetchDetails() {
        System.out.println("Email is: " + dto.getEmail());
        System.out.println("Name is: " + dto.getName());
        System.out.println("Phone Number is: " + dto.getPhnNo());
        System.out.println("Software Skills are: " + dto.getSoftwareskills());
        System.out.println("Education is: " + dto.getEduaction());
    }

}
