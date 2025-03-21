class Pepper{
	
		static String brand = "Essenzia";
		static String itemForm = "Whole";
		static int noOfItem = 2;
		static String variety = "Black Pepper";
	public static void main(String args []){
		System.out.println("The brand of Pepper is "+brand);
	    System.out.println("The item form of the Pepper is "+itemForm);
		System.out.println("The number of items of the Pepper are "+noOfItem);
		System.out.println("The variety of the Pepper is "+variety);
		
		updatePepper();
		
		 // brand = "HNGYFGF";
		 // itemForm = "Powder";
		 // noOfItem = 10;
		 // variety = "Black Pepper";
		
		System.out.println("The brand of Pepper is "+brand);
	    System.out.println("The item form of the Pepper is "+itemForm);
		System.out.println("The number of items of the Pepper are "+noOfItem);
		System.out.println("The variety of the Pepper is "+variety);
		
	}
	public static void updatePepper(){
		brand = "HNGYFGF";
		 itemForm = "Powder";
		 noOfItem = 10;
		 variety = "Black Pepper";
	}
}