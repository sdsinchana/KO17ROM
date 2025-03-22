class FastTagRunner {
    public static void main(String args[]) {
        FastTag firstRef = new FastTag();
        firstRef.id = 1;
        firstRef.vehicleNumber = "KA01AB1234";
        firstRef.ownerName = "Ravi Kumar";
        firstRef.balance = 500.00;
        firstRef.issuingBank = "SBI";
        
        System.out.println("The Id is : " + firstRef.id);
        System.out.println("The Vehicle Number is : " + firstRef.vehicleNumber);
        System.out.println("The Owner Name is : " + firstRef.ownerName);
        System.out.println("The Balance is : " + firstRef.balance);
        System.out.println("The Issuing Bank is : " + firstRef.issuingBank);
        
        FastTag secondRef = new FastTag();
        secondRef.id = 2;
        secondRef.vehicleNumber = "KA02CD5678";
        secondRef.ownerName = "Anita Sharma";
        secondRef.balance = 750.50;
        secondRef.issuingBank = "HDFC";
        
        System.out.println("The Id is : " + secondRef.id);
        System.out.println("The Vehicle Number is : " + secondRef.vehicleNumber);
        System.out.println("The Owner Name is : " + secondRef.ownerName);
        System.out.println("The Balance is : " + secondRef.balance);
        System.out.println("The Issuing Bank is : " + secondRef.issuingBank);
        
        FastTag thirdRef = new FastTag();
        thirdRef.id = 3;
        thirdRef.vehicleNumber = "KA03EF9012";
        thirdRef.ownerName = "Sunil Patil";
        thirdRef.balance = 300.75;
        thirdRef.issuingBank = "ICICI";
        
        System.out.println("The Id is : " + thirdRef.id);
        System.out.println("The Vehicle Number is : " + thirdRef.vehicleNumber);
        System.out.println("The Owner Name is : " + thirdRef.ownerName);
        System.out.println("The Balance is : " + thirdRef.balance);
        System.out.println("The Issuing Bank is : " + thirdRef.issuingBank);
        
        FastTag fourthRef = new FastTag();
        fourthRef.id = 4;
        fourthRef.vehicleNumber = "KA04GH3456";
        fourthRef.ownerName = "Meena Rao";
        fourthRef.balance = 900.00;
        fourthRef.issuingBank = "Axis Bank";
        
        System.out.println("The Id is : " + fourthRef.id);
        System.out.println("The Vehicle Number is : " + fourthRef.vehicleNumber);
        System.out.println("The Owner Name is : " + fourthRef.ownerName);
        System.out.println("The Balance is : " + fourthRef.balance);
        System.out.println("The Issuing Bank is : " + fourthRef.issuingBank);
        
        FastTag fifthRef = new FastTag();
        fifthRef.id = 5;
        fifthRef.vehicleNumber = "KA05IJ7890";
        fifthRef.ownerName = "Rajesh Verma";
        fifthRef.balance = 650.25;
        fifthRef.issuingBank = "Kotak Mahindra";
        
        System.out.println("The Id is : " + fifthRef.id);
        System.out.println("The Vehicle Number is : " + fifthRef.vehicleNumber);
        System.out.println("The Owner Name is : " + fifthRef.ownerName);
        System.out.println("The Balance is : " + fifthRef.balance);
        System.out.println("The Issuing Bank is : " + fifthRef.issuingBank);
    }
}
