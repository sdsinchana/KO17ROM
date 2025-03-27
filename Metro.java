class Metro {
    int id;
    String metroName;
    String city;
    int capacity;
    double ticketPrice;
    boolean isExpress;
    
    Metro() {
        this("City Metro", "New York");
    }

    Metro(String metroName, String city) {
        this(101);
        this.metroName = metroName;
        this.city = city;
    }
    
    Metro(int id) {
        this(500, true);
        this.id = id;
    }
    
    Metro(int capacity, boolean isExpress) {
        this(2.75);
        this.capacity = capacity;
        this.isExpress = isExpress;
    }
    
    Metro(double ticketPrice) {
        this("NY Transit");
        this.ticketPrice = ticketPrice;
    }
    
    Metro(String metroName) {
        this(true);
        this.metroName = metroName;
    }
    
    Metro(boolean isExpress) {
        this.isExpress = isExpress;
    }
    
    void displayDetails() {
        System.out.println("Metro ID: " + id);
        System.out.println("Metro Name: " + metroName);
        System.out.println("City: " + city);
        System.out.println("Capacity: " + capacity);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Express Service: " + isExpress);
    }
}
