class UberEats {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Shahi Tukda") {
            price = 159.99;
        } 
		else if (foodName == "Chicken Korma") {
            price = 289.99;
        } 
		else if (foodName == "Mushroom Manchurian") {
            price = 169.99;
        } 
		else if (foodName == "Lamb Chops") {
            price = 499.99;
        } 
		else if (foodName == "Methi Malai Paneer") {
            price = 249.99;
        } 
		else if (foodName == "Stuffed Kulcha") {
            price = 119.99;
        } 
		else if (foodName == "Mango Lassi") {
            price = 99.99;
        } 
		else if (foodName == "Sheer Kurma") {
            price = 179.99;
        } 
		else if (foodName == "Kadhi Pakora") {
            price = 199.99;
        } 
		else if (foodName == "Veg Kofta Curry") {
            price = 229.99;
        } 
		else if (foodName == "Bhindi Masala") {
            price = 149.99;
        } 
		else if (foodName == "Aloo Gobi") {
            price = 129.99;
        } 
		else if (foodName == "Cheese Burst Dosa") {
            price = 179.50;
        } 
		else if (foodName == "Besan Ladoo") {
            price = 99.99;
        } 
		else if (foodName == "Amritsari Fish") {
            price = 279.99;
        } 
		else if (foodName == "Vegetable Jalfrezi") {
            price = 209.50;
        } 
		else if (foodName == "Kesar Pista Kulfi") {
            price = 119.99;
        } 
		else if (foodName == "Lemon Rice") {
            price = 139.99;
        } 
		else if (foodName == "Tomato Rasam") {
            price = 99.99;
        } 
		else if (foodName == "Ragi Mudde") {
            price = 89.99;
        } 
		else if (foodName == "Bisi Bele Bath") {
            price = 169.99;
        } 
		else if (foodName == "Kara Kozhambu") {
            price = 139.99;
        } 
		else if (foodName == "Banana Chips") {
            price = 79.99;
        } 
		else if (foodName == "Mishti Doi") {
            price = 109.99;
        } 
		else if (foodName == "Shorshe Ilish") {
            price = 349.99;
        } 
		else if (foodName == "Dhokla") {
            price = 119.99;
        } 
		else if (foodName == "Dal Baati Churma") {
            price = 239.99;
        } 
		else if (foodName == "Gatta Curry") {
            price = 209.99;
        } 
		else if (foodName == "Pesarattu") {
            price = 129.50;
        } 
		else if (foodName == "Neer Dosa") {
            price = 139.99;
        } 
		else if (foodName == "Chettinad Chicken") {
            price = 349.99;
        } 
		else if (foodName == "Mysore Bonda") {
            price = 99.99;
        } 
		else if (foodName == "Paneer Bhurji") {
            price = 199.99;
        } 
		else if (foodName == "Sindhi Kadhi") {
            price = 159.99;
        } 
		else if (foodName == "Egg Bhurji") {
            price = 149.99;
        } 
		else if (foodName == "Aam Panna") {
            price = 89.99;
        } 
		else if (foodName == "Rajasthani Mirchi Vada") {
            price = 129.99;
        } 
		else if (foodName == "Stuffed Capsicum") {
            price = 219.99;
        } 
		else {
            System.out.println(foodName + " is not available on UberEats");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
}

