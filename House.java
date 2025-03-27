class House {
    int id;
    String houseType;
    String location;
    int floors;
    double area;
    boolean hasGarage;
    
    House() {
        this("Apartment", "New York");
    }

    House(String houseType, String location) {
        this(101);
        this.houseType = houseType;
        this.location = location;
    }
    
    House(int id) {
        this(2, true);
        this.id = id;
    }
    
    House(int floors, boolean hasGarage) {
        this(1500.5);
        this.floors = floors;
        this.hasGarage = hasGarage;
    }
    
    House(double area) {
        this("Villa");
        this.area = area;
    }
    
    House(String houseType) {
        this(true);
        this.houseType = houseType;
    }
    
    House(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
    
    void displayDetails() {
        System.out.println("House ID: " + id);
        System.out.println("House Type: " + houseType);
        System.out.println("Location: " + location);
        System.out.println("Floors: " + floors);
        System.out.println("Area: " + area);
        System.out.println("Has Garage: " + hasGarage);
    }
}



