class Stove {
    
    String brand;
    double price;
    String model;
    
    Stove() {
        System.out.println("Stove Details");
    }
    
    Stove(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }
}
