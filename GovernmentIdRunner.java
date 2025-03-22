class GovernmentIdRunner {
    public static void main(String args[]) {
    
        GovernmentId firstRef = new GovernmentId();
        firstRef.id = 1;
        firstRef.name = "Aadhar";
        firstRef.type = "Biometric";
        firstRef.issuingAuthority = "UIDAI";
        firstRef.country = "India";
        
        System.out.println("The Id is : " + firstRef.id);
        System.out.println("The Name is : " + firstRef.name);
        System.out.println("The Type is : " + firstRef.type);
        System.out.println("The Issuing Authority is : " + firstRef.issuingAuthority);
        System.out.println("The Country is : " + firstRef.country);
        
        GovernmentId secondRef = new GovernmentId();
        secondRef.id = 2;
        secondRef.name = "Passport";
        secondRef.type = "Travel Document";
        secondRef.issuingAuthority = "Ministry of External Affairs";
        secondRef.country = "India";
        
        System.out.println("The Id is : " + secondRef.id);
        System.out.println("The Name is : " + secondRef.name);
        System.out.println("The Type is : " + secondRef.type);
        System.out.println("The Issuing Authority is : " + secondRef.issuingAuthority);
        System.out.println("The Country is : " + secondRef.country);
        
        GovernmentId thirdRef = new GovernmentId();
        thirdRef.id = 3;
        thirdRef.name = "Driving License";
        thirdRef.type = "Motor Vehicle License";
        thirdRef.issuingAuthority = "RTO";
        thirdRef.country = "India";
        
        System.out.println("The Id is : " + thirdRef.id);
        System.out.println("The Name is : " + thirdRef.name);
        System.out.println("The Type is : " + thirdRef.type);
        System.out.println("The Issuing Authority is : " + thirdRef.issuingAuthority);
        System.out.println("The Country is : " + thirdRef.country);
        
        GovernmentId fourthRef = new GovernmentId();
        fourthRef.id = 4;
        fourthRef.name = "Voter ID";
        fourthRef.type = "Election Identity";
        fourthRef.issuingAuthority = "Election Commission";
        fourthRef.country = "India";
        
        System.out.println("The Id is : " + fourthRef.id);
        System.out.println("The Name is : " + fourthRef.name);
        System.out.println("The Type is : " + fourthRef.type);
        System.out.println("The Issuing Authority is : " + fourthRef.issuingAuthority);
        System.out.println("The Country is : " + fourthRef.country);
        
        GovernmentId fifthRef = new GovernmentId();
        fifthRef.id = 5;
        fifthRef.name = "PAN Card";
        fifthRef.type = "Tax Identification";
        fifthRef.issuingAuthority = "Income Tax Department";
        fifthRef.country = "India";
        
        System.out.println("The Id is : " + fifthRef.id);
        System.out.println("The Name is : " + fifthRef.name);
        System.out.println("The Type is : " + fifthRef.type);
        System.out.println("The Issuing Authority is : " + fifthRef.issuingAuthority);
        System.out.println("The Country is : " + fifthRef.country);
        
        GovernmentId sixthRef = new GovernmentId();
        sixthRef.id = 6;
        sixthRef.name = "Social Security Card";
        sixthRef.type = "Social Security";
        sixthRef.issuingAuthority = "SSA";
        sixthRef.country = "USA";
        
        System.out.println("The Id is : " + sixthRef.id);
        System.out.println("The Name is : " + sixthRef.name);
        System.out.println("The Type is : " + sixthRef.type);
        System.out.println("The Issuing Authority is : " + sixthRef.issuingAuthority);
        System.out.println("The Country is : " + sixthRef.country);
        
        GovernmentId seventhRef = new GovernmentId();
        seventhRef.id = 7;
        seventhRef.name = "National ID";
        seventhRef.type = "Identity Card";
        seventhRef.issuingAuthority = "Government of UK";
        seventhRef.country = "UK";
        
        System.out.println("The Id is : " + seventhRef.id);
        System.out.println("The Name is : " + seventhRef.name);
        System.out.println("The Type is : " + seventhRef.type);
        System.out.println("The Issuing Authority is : " + seventhRef.issuingAuthority);
        System.out.println("The Country is : " + seventhRef.country);
        
        GovernmentId eighthRef = new GovernmentId();
        eighthRef.id = 8;
        eighthRef.name = "Resident Permit";
        eighthRef.type = "Immigration Document";
        eighthRef.issuingAuthority = "Government of Canada";
        eighthRef.country = "Canada";
        
        System.out.println("The Id is : " + eighthRef.id);
        System.out.println("The Name is : " + eighthRef.name);
        System.out.println("The Type is : " + eighthRef.type);
        System.out.println("The Issuing Authority is : " + eighthRef.issuingAuthority);
        System.out.println("The Country is : " + eighthRef.country);
        
        GovernmentId ninthRef = new GovernmentId();
        ninthRef.id = 9;
        ninthRef.name = "Green Card";
        ninthRef.type = "Permanent Resident Card";
        ninthRef.issuingAuthority = "USCIS";
        ninthRef.country = "USA";
        
        System.out.println("The Id is : " + ninthRef.id);
        System.out.println("The Name is : " + ninthRef.name);
        System.out.println("The Type is : " + ninthRef.type);
        System.out.println("The Issuing Authority is : " + ninthRef.issuingAuthority);
        System.out.println("The Country is : " + ninthRef.country);
    }
}
