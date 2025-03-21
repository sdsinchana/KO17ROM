class Swiggy {
	
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Pizza") {
            price = 299.99;
        } 
		else if (foodName == "Burger") {
            price = 149.99;
        } 
		else if (foodName == "Pasta") {
            price = 199.50;
        } 
		else if (foodName == "Biryani") {
            price = 349.00;
        } 
		else if (foodName == "Dosa") {
            price = 99.99;
        } 
		else if (foodName == "Idli") {
            price = 69.99;
        } 
		else if (foodName == "Samosa") {
            price = 49.99;
        } 
		else if (foodName == "Paneer Butter Masala") {
            price = 299.50;
        } 
		else if (foodName == "Chole Bhature") {
            price = 179.99;
        } 
		else if (foodName == "Fried Rice") {
            price = 229.99;
        } 
		else if (foodName == "Chicken Curry") {
            price = 349.50;
        } 
		else if (foodName == "Fish Fry") {
            price = 399.00;
        } 
		else if (foodName == "Momos") {
            price = 129.99;
        } 
		else if (foodName == "Pav Bhaji") {
            price = 159.99;
        } 
		else if (foodName == "Masala Dosa") {
            price = 119.99;
        } 
		else if (foodName == "Butter Naan") {
            price = 49.50;
        } 
		else if (foodName == "Gobi Manchurian") {
            price = 199.00;
        } 
		
		else if (foodName == "Egg Roll") {
            price = 89.99;
        } 
		else if (foodName == "Veg Thali") {
            price = 259.99;
        } 
		else if (foodName == "Non-Veg Thali") {
            price = 399.99;
        } 
		else if (foodName == "Dal Makhani") {
            price = 249.99;
        } 
		else if (foodName == "Mutton Biryani") {
            price = 499.99;
        } 
		else if (foodName == "Spring Roll") {
            price = 139.99;
        } 
		else if (foodName == "Kebab") {
            price = 279.99;
        } 
		else if (foodName == "Tandoori Chicken") {
            price = 459.99;
        } 
		else if (foodName == "Paneer Tikka") {
            price = 299.99;
        } 
		else if (foodName == "Dal Tadka") {
            price = 199.50;
        } 
		else if (foodName == "Aloo Paratha") {
            price = 99.99;
        } 
		else if (foodName == "Chilli Chicken") {
            price = 349.00;
        } 
		else if (foodName == "Hyderabadi Biryani") {
            price = 399.99;
        } 
		else if (foodName == "Shawarma") {
            price = 179.50;
        } 
		else if (foodName == "French Fries") {
            price = 129.99;
        } 
		else if (foodName == "Nachos") {
            price = 199.99;
        } 
		else if (foodName == "Chicken Wings") {
            price = 249.99;
        } 
		else if (foodName == "Ice Cream") {
            price = 99.99;
        } 
		else if (foodName == "Gulab Jamun") {
            price = 69.99;
        } 
		else if (foodName == "Dhabeli") {
            price = 59.99;
        } 
		else if (foodName == "Rasmalai") {
            price = 89.99;
        } 
		else if (foodName == "Falooda") {
            price = 149.99;
        } 
		else {
            System.out.println(foodName + " is not available on Swiggy");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
		
        return price;
    }
	
}


