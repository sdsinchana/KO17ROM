class SpecsRunner {
    public static void main(String args[]) {
        Specs firstRef = new Specs();
        firstRef.id = 1;
        firstRef.name = "Laptop";
        firstRef.type = "Electronics";
        firstRef.manufacturer = "Dell";
        firstRef.price = 75000.50;
        
        System.out.println("The Specs ID is: " + firstRef.id);
        System.out.println("The Specs Name is: " + firstRef.name);
        System.out.println("The Specs Type is: " + firstRef.type);
        System.out.println("The Manufacturer is: " + firstRef.manufacturer);
        System.out.println("The Price is: " + firstRef.price);
        
        Specs secondRef = new Specs();
        secondRef.id = 2;
        secondRef.name = "Smartphone";
        secondRef.type = "Electronics";
        secondRef.manufacturer = "Samsung";
        secondRef.price = 60000.00;
        
        System.out.println("The Specs ID is: " + secondRef.id);
        System.out.println("The Specs Name is: " + secondRef.name);
        System.out.println("The Specs Type is: " + secondRef.type);
        System.out.println("The Manufacturer is: " + secondRef.manufacturer);
        System.out.println("The Price is: " + secondRef.price);
        
        Specs thirdRef = new Specs();
        thirdRef.id = 3;
        thirdRef.name = "Tablet";
        thirdRef.type = "Electronics";
        thirdRef.manufacturer = "Apple";
        thirdRef.price = 85000.75;
        
        System.out.println("The Specs ID is: " + thirdRef.id);
        System.out.println("The Specs Name is: " + thirdRef.name);
        System.out.println("The Specs Type is: " + thirdRef.type);
        System.out.println("The Manufacturer is: " + thirdRef.manufacturer);
        System.out.println("The Price is: " + thirdRef.price);
        
        Specs fourthRef = new Specs();
        fourthRef.id = 4;
        fourthRef.name = "Smartwatch";
        fourthRef.type = "Wearable";
        fourthRef.manufacturer = "Garmin";
        fourthRef.price = 45000.25;
        
        System.out.println("The Specs ID is: " + fourthRef.id);
        System.out.println("The Specs Name is: " + fourthRef.name);
        System.out.println("The Specs Type is: " + fourthRef.type);
        System.out.println("The Manufacturer is: " + fourthRef.manufacturer);
        System.out.println("The Price is: " + fourthRef.price);
        
        Specs fifthRef = new Specs();
        fifthRef.id = 5;
        fifthRef.name = "Monitor";
        fifthRef.type = "Display";
        fifthRef.manufacturer = "LG";
        fifthRef.price = 30000.00;
        
        System.out.println("The Specs ID is: " + fifthRef.id);
        System.out.println("The Specs Name is: " + fifthRef.name);
        System.out.println("The Specs Type is: " + fifthRef.type);
        System.out.println("The Manufacturer is: " + fifthRef.manufacturer);
        System.out.println("The Price is: " + fifthRef.price);
    }
}
