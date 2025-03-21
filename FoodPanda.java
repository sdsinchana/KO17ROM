class FoodPanda {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Stuffed Kulcha") {
            price = 89.99;
        } 
		else if (foodName == "Chicken Shawarma") {
            price = 179.99;
        } 
		else if (foodName == "Mushroom Masala") {
            price = 249.99;
        } 
		else if (foodName == "Roti with Ghee") {
            price = 49.99;
        } 
		else if (foodName == "Aloo Puri") {
            price = 159.99;
        } 
		else if (foodName == "Keema Biryani") {
            price = 329.99;
        } 
		else if (foodName == "Paneer Tikka") {
            price = 279.99;
        } 
		else if (foodName == "Vegetable Pulao") {
            price = 189.99;
        } 
		else if (foodName == "Mutton Korma") {
            price = 419.99;
        } 
		else if (foodName == "Egg Fried Rice") {
            price = 169.99;
        } 
		else if (foodName == "Chana Masala") {
            price = 219.99;
        } 
		else if (foodName == "Rava Dosa") {
            price = 129.99;
        } 
		else if (foodName == "Banana Chips") {
            price = 79.99;
        } 
		else if (foodName == "Gobi Manchurian") {
            price = 199.99;
        } 
		else if (foodName == "Tandoori Chicken") {
            price = 349.99;
        } 
		else if (foodName == "Lemon Rice") {
            price = 139.99;
        } 
		else if (foodName == "Dal Tadka") {
            price = 159.99;
        } 
		else if (foodName == "Bengali Fish Curry") {
            price = 299.99;
        } 
		else if (foodName == "Pani Puri") {
            price = 99.99;
        } 
		else if (foodName == "Egg Roll") {
            price = 119.99;
        } 
		else if (foodName == "Sweet Corn Soup") {
            price = 139.99;
        } 
		else if (foodName == "Cheese Garlic Naan") {
            price = 89.99;
        } 
		else if (foodName == "Sabudana Khichdi") {
            price = 179.99;
        } 
		else if (foodName == "Veg Frankie") {
            price = 149.99;
        } 
		else if (foodName == "Chicken Tandoori Momos") {
            price = 249.99;
        } 
		else if (foodName == "Lassi") {
            price = 89.99;
        } 
		else if (foodName == "Coconut Barfi") {
            price = 129.99;
        } 
		else if (foodName == "Mutton Kebab") {
            price = 359.99;
        } 
		else if (foodName == "Veg Paniyaram") {
            price = 169.99;
        } 
		else if (foodName == "Sheer Khurma") {
            price = 139.99;
        } 
		else if (foodName == "Badam Halwa") {
            price = 179.99;
        } 
		else if (foodName == "Fish Tikka") {
            price = 329.99;
        } 
		else if (foodName == "Lauki Kofta") {
            price = 159.99;
        } 
		else if (foodName == "Zafrani Pulao") {
            price = 229.99;
        } 
		else if (foodName == "Veg Hakka Chowmein") {
            price = 199.99;
        } 
		else if (foodName == "Moong Dal Halwa") {
            price = 149.99;
        } 
		else if (foodName == "Mango Shrikhand") {
            price = 189.99;
        } 
		else if (foodName == "Bisi Bele Bath") {
            price = 209.99;
        } 
		else if (foodName == "Jackfruit Biryani") {
            price = 249.99;
        } 
		else {
            System.out.println(foodName + " is not available on FoodPanda");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
}


