class Metal {
    int id;
    String metalName;
    String type;
    int hardness;
    double meltingPoint;
    boolean isConductive;
    
    Metal() {
        this("Iron", "Ferrous");
    }

    Metal(String metalName, String type) {
        this(101);
        this.metalName = metalName;
        this.type = type;
    }
    
    Metal(int id) {
        this(7, true);
        this.id = id;
    }
    
    Metal(int hardness, boolean isConductive) {
        this(1538.0);
        this.hardness = hardness;
        this.isConductive = isConductive;
    }
    
    Metal(double meltingPoint) {
        this("Steel");
        this.meltingPoint = meltingPoint;
    }
    
    Metal(String metalName) {
        this(true);
        this.metalName = metalName;
    }
    
    Metal(boolean isConductive) {
        this.isConductive = isConductive;
    }
    
    void displayDetails() {
        System.out.println("Metal ID: " + id);
        System.out.println("Metal Name: " + metalName);
        System.out.println("Type: " + type);
        System.out.println("Hardness: " + hardness);
        System.out.println("Melting Point: " + meltingPoint);
        System.out.println("Conductive: " + isConductive);
    }
}


