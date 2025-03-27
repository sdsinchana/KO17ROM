class Wire {
    int id;
    String wireType;
    String material;
    int length;
    double thickness;
    boolean isInsulated;
    
    Wire() {
        this("Copper", "Electrical Wire");
    }

    Wire(String wireType, String material) {
        this(101);
        this.wireType = wireType;
        this.material = material;
    }
    
    Wire(int id) {
        this(50, true);
        this.id = id;
    }
    
    Wire(int length, boolean isInsulated) {
        this(2.5);
        this.length = length;
        this.isInsulated = isInsulated;
    }
    
    Wire(double thickness) {
        this("Fiber Optic");
        this.thickness = thickness;
    }
    
    Wire(String wireType) {
        this(true);
        this.wireType = wireType;
    }
    
    Wire(boolean isInsulated) {
        this.isInsulated = isInsulated;
    }
    
    void displayDetails() {
        System.out.println("Wire ID: " + id);
        System.out.println("Wire Type: " + wireType);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Thickness: " + thickness);
        System.out.println("Insulated: " + isInsulated);
    }
}



