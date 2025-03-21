class Softdrink{
	
	 static String brand = "Dadbur";
		static String flavour = "Pure Honey";
		static String type = "Bottle";
		static String origin = "India";
	
	public static void main(String args []){
		
		System.out.println("The brand of the Softdrink is "+brand);
		System.out.println("The flavour of the Softdrink is "+flavour);
		System.out.println("The type of the Softdrink is "+type);
		System.out.println("The origin of the Softdrink is "+origin 	);
		
		updateSoftdrink();
		
		 brand = "Sprite";
		 flavour = "Lemon";
		 type = "Tin";
		 origin = "Foreign";
		
		System.out.println("The brand of the Softdrink is "+brand);
		System.out.println("The flavour of the Softdrink is "+flavour);
		System.out.println("The type of the Softdrink is "+type);
		System.out.println("The origin of the Softdrink is "+origin 	);
	}
	
	public static void updateSoftdrink(){
		brand = "Sprite";
		 flavour = "Lemon";
		 type = "Tin";
		 origin = "Foreign";
	}
}
		