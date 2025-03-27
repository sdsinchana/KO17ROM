class Mat {
    
    String material;
    double price;
    String size;
    
    Mat() {
        System.out.println("Mat Details");
    }
    
    Mat(String material, double price, String size) {
        this.material = material;
        this.price = price;
        this.size = size;
    }
}
