class HotelRunner {
    public static void main(String args[]) {
        Hotel firstRef = new Hotel();
        firstRef.id = 1;
        firstRef.name = "Grand Palace";
        firstRef.location = "New York";
        firstRef.numberOfRooms = 200;
        firstRef.manager = "Michael";
        
        System.out.println("The Hotel ID is: " + firstRef.id);
        System.out.println("The Hotel Name is: " + firstRef.name);
        System.out.println("The Hotel Location is: " + firstRef.location);
        System.out.println("The Number of Rooms is: " + firstRef.numberOfRooms);
        System.out.println("The Hotel Manager is: " + firstRef.manager);
        
        Hotel secondRef = new Hotel();
        secondRef.id = 2;
        secondRef.name = "Ocean View";
        secondRef.location = "Miami";
        secondRef.numberOfRooms = 150;
        secondRef.manager = "Sarah";
        
        System.out.println("The Hotel ID is: " + secondRef.id);
        System.out.println("The Hotel Name is: " + secondRef.name);
        System.out.println("The Hotel Location is: " + secondRef.location);
        System.out.println("The Number of Rooms is: " + secondRef.numberOfRooms);
        System.out.println("The Hotel Manager is: " + secondRef.manager);
        
        Hotel thirdRef = new Hotel();
        thirdRef.id = 3;
        thirdRef.name = "Mountain Retreat";
        thirdRef.location = "Denver";
        thirdRef.numberOfRooms = 120;
        thirdRef.manager = "John";
        
        System.out.println("The Hotel ID is: " + thirdRef.id);
        System.out.println("The Hotel Name is: " + thirdRef.name);
        System.out.println("The Hotel Location is: " + thirdRef.location);
        System.out.println("The Number of Rooms is: " + thirdRef.numberOfRooms);
        System.out.println("The Hotel Manager is: " + thirdRef.manager);
        
        Hotel fourthRef = new Hotel();
        fourthRef.id = 4;
        fourthRef.name = "City Inn";
        fourthRef.location = "Los Angeles";
        fourthRef.numberOfRooms = 180;
        fourthRef.manager = "Emma";
        
        System.out.println("The Hotel ID is: " + fourthRef.id);
        System.out.println("The Hotel Name is: " + fourthRef.name);
        System.out.println("The Hotel Location is: " + fourthRef.location);
        System.out.println("The Number of Rooms is: " + fourthRef.numberOfRooms);
        System.out.println("The Hotel Manager is: " + fourthRef.manager);
        
        Hotel fifthRef = new Hotel();
        fifthRef.id = 5;
        fifthRef.name = "Luxury Stay";
        fifthRef.location = "Las Vegas";
        fifthRef.numberOfRooms = 300;
        fifthRef.manager = "Robert";
        
        System.out.println("The Hotel ID is: " + fifthRef.id);
        System.out.println("The Hotel Name is: " + fifthRef.name);
        System.out.println("The Hotel Location is: " + fifthRef.location);
        System.out.println("The Number of Rooms is: " + fifthRef.numberOfRooms);
        System.out.println("The Hotel Manager is: " + fifthRef.manager);
    }
}
