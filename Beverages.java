class Beverages {
		static String brand = "Tribe";
		static String item = "Liquid";
		static String flavour = "Unity";
		static int noOfItem = 2;
		static String speciality = "Natural";
	public static void main(String args []){
		
		System.out.println("The brand of Beverages is"+brand);
	    System.out.println("The item of the Beverages is "+item);
		System.out.println("The flavour of the Beverages is "+flavour);
		System.out.println("The number of items of the Beverages are "+noOfItem);
	System.out.println("The Speciality is "+speciality);
	
	     updateBeverages();
		 // brand = "Monk";
		 // item = "Liquid";
		 // flavour = "Grapes";
		 // noOfItem = 6;
		 // speciality = "Natural";
		
		System.out.println("The brand of Beverages is"+brand);
	    System.out.println("The item of the Beverages is "+item);
		System.out.println("The flavour of the Beverages is "+flavour);
		System.out.println("The number of items of the Beverages are "+noOfItem);
	System.out.println("The Speciality is "+speciality);
	}
	
	public static void updateBeverages(){
		brand = "Monk";
		 item = "Liquid";
		 flavour = "Grapes";
		 noOfItem = 6;
		 speciality = "Natural";
		
	}
}