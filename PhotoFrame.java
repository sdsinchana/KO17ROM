class PhotoFrame {
    
    String material;
    double price;
    String size;
    
    PhotoFrame() {
        System.out.println("PhotoFrame Details");
    }
    
    PhotoFrame(String material, double price, String size) {
        this.material = material;
        this.price = price;
        this.size = size;
    }
}

