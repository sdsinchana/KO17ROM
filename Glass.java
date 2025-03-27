class Glass {
    int id;
    String glassType;
    String color;
    int transparencyLevel;
    double thickness;
    boolean isTempered;
    
    Glass() {
        this("Window Glass", "Clear");
    }

    Glass(String glassType, String color) {
        this(101);
        this.glassType = glassType;
        this.color = color;
    }
    
    Glass(int id) {
        this(80, true);
        this.id = id;
    }
    
    Glass(int transparencyLevel, boolean isTempered) {
        this(5.5);
        this.transparencyLevel = transparencyLevel;
        this.isTempered = isTempered;
    }
    
    Glass(double thickness) {
        this("Frosted Glass");
        this.thickness = thickness;
    }
    
    Glass(String glassType) {
        this(true);
        this.glassType = glassType;
    }
    
    Glass(boolean isTempered) {
        this.isTempered = isTempered;
    }
    
    void displayDetails() {
        System.out.println("Glass ID: " + id);
        System.out.println("Glass Type: " + glassType);
        System.out.println("Color: " + color);
        System.out.println("Transparency Level: " + transparencyLevel);
        System.out.println("Thickness: " + thickness);
        System.out.println("Tempered: " + isTempered);
    }
}

