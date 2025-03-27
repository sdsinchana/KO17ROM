class Paper {
    int id;
    String paperType;
    String size;
    int thickness;
    double weight;
    boolean isRecycled;
    
    Paper() {
        this("A4", "Office Paper");
    }

    Paper(String paperType, String size) {
        this(101);
        this.paperType = paperType;
        this.size = size;
    }
    
    Paper(int id) {
        this(80, true);
        this.id = id;
    }
    
    Paper(int thickness, boolean isRecycled) {
        this(4.5);
        this.thickness = thickness;
        this.isRecycled = isRecycled;
    }
    
    Paper(double weight) {
        this("Notebook Paper");
        this.weight = weight;
    }
    
    Paper(String paperType) {
        this(9001L);
        this.paperType = paperType;
    }
    
    Paper(long id) {
        System.out.println("Paper ID: " + id);
    }
    
    void displayDetails() {
        System.out.println("Paper ID: " + id);
        System.out.println("Paper Type: " + paperType);
        System.out.println("Size: " + size);
        System.out.println("Thickness: " + thickness);
        System.out.println("Weight: " + weight);
        System.out.println("Recycled: " + isRecycled);
    }
}


