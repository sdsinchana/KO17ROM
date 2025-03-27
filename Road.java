class Road {
    int id;
    String roadType;
    String location;
    int length;
    double width;
    boolean isHighway;
    
    Road() {
        this("Concrete Road", "Downtown");
    }

    Road(String roadType, String location) {
        this(101);
        this.roadType = roadType;
        this.location = location;
    }
    
    Road(int id) {
        this(500, true);
        this.id = id;
    }
    
    Road(int length, boolean isHighway) {
        this(12.5);
        this.length = length;
        this.isHighway = isHighway;
    }
    
    Road(double width) {
        this("Asphalt Road");
        this.width = width;
    }
    
    Road(String roadType) {
        this(true);
        this.roadType = roadType;
    }
    
    Road(boolean isHighway) {
		this.isHighway = isHighway;
    }
    
    void displayDetails() {
        System.out.println("Road ID: " + id);
        System.out.println("Road Type: " + roadType);
        System.out.println("Location: " + location);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Highway: " + isHighway);
    }
}

