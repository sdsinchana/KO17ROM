class Zepto {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Quinoa Salad") {
            price = 209.99;
        } 
		else if (foodName == "Blueberry Pancakes") {
            price = 249.99;
        } 
		else if (foodName == "Pesto Pasta") {
            price = 279.99;
        } 
		else if (foodName == "Mushroom Risotto") {
            price = 319.99;
        } 
		else if (foodName == "BBQ Chicken Wings") {
            price = 269.99;
        } 
		else if (foodName == "Lamb Gyro") {
            price = 359.99;
        } 
		else if (foodName == "Chia Seed Pudding") {
            price = 139.99;
        } 
		else if (foodName == "Falafel Wrap") {
            price = 189.99;
        } 
		else if (foodName == "Grilled Salmon") {
            price = 429.99;
        } 
		else if (foodName == "Avocado Toast") {
            price = 159.99;
        } 
		else if (foodName == "Banh Mi") {
            price = 199.99;
        } 
		else if (foodName == "Katsu Curry") {
            price = 289.99;
        } 
		else if (foodName == "Pho") {
            price = 249.99;
        } 
		else if (foodName == "Eggplant Parmesan") {
            price = 219.99;
        } 
		else if (foodName == "Beef Stroganoff") {
            price = 339.99;
        } 
		else if (foodName == "Frittata") {
            price = 189.99;
        } 
		else if (foodName == "Greek Salad") {
            price = 159.99;
        } 
		else if (foodName == "Tuna Poke Bowl") {
            price = 289.99;
        } 
		else if (foodName == "Korean Bibimbap") {
            price = 319.99;
        } 
		else if (foodName == "Pumpkin Soup") {
            price = 149.99;
        } 
		else if (foodName == "Chicken Fajitas") {
            price = 279.99;
        } 
		else if (foodName == "Tofu Stir Fry") {
            price = 199.99;
        } 
		else if (foodName == "Stuffed Bell Peppers") {
            price = 229.99;
        } 
		else if (foodName == "Prawn Tempura") {
            price = 269.99;
        } 
		else if (foodName == "Shepherd’s Pie") {
            price = 299.99;
        } 
		else if (foodName == "Shakshuka") {
            price = 219.99;
        } 
		else if (foodName == "Ceviche") {
            price = 259.99;
        } 
		else if (foodName == "Miso Soup") {
            price = 129.99;
        } 
		else if (foodName == "Spinach and Ricotta Ravioli") {
            price = 289.99;
        } 
		else if (foodName == "Carrot Cake") {
            price = 149.99;
        } 
		else if (foodName == "Pad Thai") {
            price = 269.99;
        } 
		else if (foodName == "Creme Brulee") {
            price = 199.99;
        } 
		else if (foodName == "Peking Duck") {
            price = 429.99;
        } 
		else if (foodName == "Bulgogi Beef") {
            price = 349.99;
        } 
		else if (foodName == "Egg Foo Young") {
            price = 199.99;
        } 
		else if (foodName == "Lobster Roll") {
            price = 499.99;
        } 
		else if (foodName == "Mango Sticky Rice") {
            price = 179.99;
        } 
		else if (foodName == "Clam Chowder") {
            price = 249.99;
        } 
		else if (foodName == "Sushi Platter") {
            price = 599.99;
        } 
		else {
            System.out.println(foodName + " is not available on Zepto");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
}


