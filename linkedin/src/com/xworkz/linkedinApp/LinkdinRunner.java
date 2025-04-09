package com.xworkz.linkedinApp;

import com.xworkz.linkedinApp.Constants.Education;
import com.xworkz.linkedinApp.Constants.Software;
import com.xworkz.linkedinApp.linkdin.LinkedIn;
import com.xworkz.linkedinApp.linkdindto.LinkdinDto;

public class LinkdinRunner {
    public static void main(String arg[]) {

        LinkdinDto linkdinDto = new LinkdinDto();
        linkdinDto.setEmail("sinchanasd241@gmail.com");
        linkdinDto.setName("Sinchana SD ");
        linkdinDto.setPhnNo(7676496955L);
        linkdinDto.setSoftwareskills(Software.java);
        linkdinDto.setEduaction(Education.DEGREE);

        LinkedIn app = new LinkedIn();
        app.User(linkdinDto);
        app.fetchDetails();

    }
}
