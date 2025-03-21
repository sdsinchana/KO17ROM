class Pizza{
	
	static int  id = 26;
	static String name = "One Bite";
	static String size = "6 inch";
	static String type = "Veg";
	static int price = 630;
	
	public static void main(String args[]){
		System.out.println("The id of Pizza is "+id);
		System.out.println("The name of the pizza is "+name);
		System.out.println("The size of the pizza is "+size);
		System.out.println("The type of the pizza is "+type);
		System.out.println("The price is "+price);
	
		updatePizza();
	
		// id = 21;
		// name = "Toscano";
		// size = "9 inch";
		// type = "Veg half and half";
		// price = 542;
	 
	System.out.println("The id of Pizza is "+id);
	System.out.println("The name of the pizza is "+name);
	System.out.println("The size of the pizza is "+size);
	System.out.println("The type of the pizza is "+type);
	System.out.println("The price is "+price);
	}
	public static void updatePizza(){
		  id = 21;
		  name = "Toscano";
		  size = "9 inch";
		  type = "Veg half and half";
		  price = 542;
	}
	}
