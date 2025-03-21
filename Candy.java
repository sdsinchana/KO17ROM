class Candy{
	
	static String brand ="Hungry Harvest";
	static	String type = "Veg";
	static	int noOfItem = 1;
	static	String flavour = "Vanilla";
	public static void main(String args []){
		
		System.out.println("The brand of Candy is "+brand);
	    System.out.println("The type of the candy is "+type);
		System.out.println("The number of items of the candy are "+noOfItem);
	    System.out.println("The flavour is "+flavour);
		
		updateCandy();
		
		 // brand ="Chuppa Chups";
		 // type = "Veg";
		 // noOfItem = 10;
		 // flavour = "Chocolate";
		
		
		System.out.println("The brand of Candy is "+brand);
	    System.out.println("The type of the candy is "+type);
		System.out.println("The number of items of the candy are "+noOfItem);
	    System.out.println("The flavour is "+flavour);
	}
	public static void updateCandy(){
		brand ="Chuppa Chups";
		 type = "Veg";
		 noOfItem = 10;
		 flavour = "Chocolate";
	}
}