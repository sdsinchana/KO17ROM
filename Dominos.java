class Dominos{
	public static String takeOrder(String item){
		double order=0.0;
		String message = null;
		if(item =="Garlic Bread"){
			order = 99.0;
			message = "Order successfull"; 
		}
		else 
			message = "Item not found";
		return message;	
	}
	
	
	public static boolean takeOrder(String item , double quantity){
		boolean isOrderSuccess = false;
		double order= 0.0;
		
		if (item=="Garlic Bread" ){
			order = 99.0 * quantity;
			isOrderSuccess = true;
			}
		else 
			System.out.println("Privide the valid quantity");
		return isOrderSuccess;
	}
    public static double getFoodPrice(String foodName) {
        double price = 0.0;
		int quantity = 0;

        if (foodName == "Margherita Pizza") {
            price = 299.99;
        } 
		else if (foodName == "Veg Extravaganza") {
            price = 499.99;
        } 
		else if (foodName == "Farmhouse Pizza") {
            price = 459.99;
        } 
		else if (foodName == "Cheese Burst Pizza") {
            price = 519.50;
        } 
		else if (foodName == "Garlic Bread") {
            price = quantity*149.99;
        } 
		else if (foodName == "Stuffed Garlic Bread") {
            price = 199.99;
        } 
		else if (foodName == "Taco Mexicana") {
            price = 169.99;
        } 
		else if (foodName == "Veg Supreme Burger") {
            price = 229.50;
        } 
		else if (foodName == "Classic Hand Tossed Pizza") {
            price = 399.00;
        } 
		else if (foodName == "Chicken Dominator Pizza") {
            price = 599.99;
        } 
		else if (foodName == "Paneer Makhani Pizza") {
            price = 479.99;
        } 
		else if (foodName == "Peppy Paneer Pizza") {
            price = 449.50;
        }
		else if (foodName == "Spiced Chicken Wings") {
            price = 329.00;
        } 
		else if (foodName == "Peri Peri Chicken Pizza") {
            price = 579.99;
        } 
		else if (foodName == "Chicken Keema Paratha") {
            price = 259.99;
        } 
		else if (foodName == "Chicken Sausage Pizza") {
            price = 519.50;
        } 
		else if (foodName == "Pepperoni Pizza") {
            price = 619.99;
        } 
		else if (foodName == "Tandoori Paneer Pizza") {
            price = 489.00;
        } 
		else if (foodName == "Veggie Paradise Pizza") {
            price = 429.99;
        } 
		else if (foodName == "BBQ Chicken Pizza") {
            price = 559.99;
        } 
		else if (foodName == "Chicken Zinger Burger") {
            price = 289.50;
        } 
		else if (foodName == "Choco Lava Cake") {
            price = 119.99;
        } 
		else if (foodName == "Choco Brownie") {
            price = 149.99;
        } 
		else if (foodName == "Tandoori Chicken Wings") {
            price = 349.99;
        } 
		else if (foodName == "Chicken Tikka Sandwich") {
            price = 219.99;
        } 
		else if (foodName == "Veggie Wrap") {
            price = 159.50;
        } 
		else if (foodName == "Cheese Garlic Sticks") {
            price = 179.99;
        } 
		else if (foodName == "Pasta Italiano") {
            price = 249.99;
        } 
		else if (foodName == "Mexican Green Wave Pizza") {
            price = 489.99;
        } 
		else if (foodName == "Veg Manchurian Pizza") {
            price = 419.99;
        } 
		else if (foodName == "BBQ Sausage Pizza") {
            price = 579.99;
        } 
		else if (foodName == "Double Cheese Margherita") {
            price = 369.99;
        } 
		else if (foodName == "Chicken Seekh Kebab") {
            price = 259.99;
        } 
		else if (foodName == "Mushroom Delight Pizza") {
            price = 399.50;
        } 
		else if (foodName == "Paneer Roll") {
            price = 209.99;
        } 
		else if (foodName == "Spicy Chicken Burger") {
            price = 279.99;
        } 
		else if (foodName == "Butter Chicken Pizza") {
            price = 549.99;
        } 
		else if (foodName == "Tandoori Chicken Roll") {
            price = 289.99;
        } 
		else {
            System.out.println(foodName + " is not available on Dominos");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
		
        return price;
    }
}


