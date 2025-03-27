class Switch {
    int id;
    String switchType;
    String brand;
    int voltage;
    double price;
    boolean isSmart;
    
    Switch() {
        this("Electrical Switch", "Philips");
    }

    Switch(String switchType, String brand) {
        this(101);
        this.switchType = switchType;
        this.brand = brand;
    }
    
    Switch(int id) {
        this(220, true);
        this.id = id;
    }
    
    Switch(int voltage, boolean isSmart) {
        this(15.75);
        this.voltage = voltage;
        this.isSmart = isSmart;
    }
    
    Switch(double price) {
        this("Smart Switch");
        this.price = price;
    }
    
    Switch(String switchType) {
        this(true);
        this.switchType = switchType;
    }
    
    Switch(boolean isSmart) {
        this.isSmart = isSmart;
    }
    
    void displayDetails() {
        System.out.println("Switch ID: " + id);
        System.out.println("Switch Type: " + switchType);
        System.out.println("Brand: " + brand);
        System.out.println("Voltage: " + voltage);
        System.out.println("Price: " + price);
        System.out.println("Smart Switch: " + isSmart);
    }
}

