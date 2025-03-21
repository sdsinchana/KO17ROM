class Food {
		static String brand = "Ceregrow ";
	static 	String subBrand = "Nestle";
	static	String flavour = "Milk";
	static	String itemForm= "Powder";
	
	public static void main(String args []){
		
		System.out.println("The brand of Food is"+brand);
	    System.out.println("The subBrand of the Food is "+subBrand);
		System.out.println("The flavour of the Food is "+flavour);
		
		System.out.println("The item form is "+itemForm);
		
		updateFood();
		
		 // brand = "Toscano ";
		 // subBrand = "Nuts";
		 // flavour = "Oragano";
		 // itemForm= "Seeds";
		
		System.out.println("The brand of Food is"+brand);
	    System.out.println("The subBrand of the Food is "+subBrand);
		System.out.println("The flavour of the Food is "+flavour);
		
		System.out.println("The item form is "+itemForm);
	}
	public static void updateFood(){
		brand = "Toscano ";
		 subBrand = "Nuts";
		 flavour = "Oragano";
		 itemForm= "Seeds";
	}
}