class Electronics{
		static String brand ="HP";
		static String color = "Black";
		static String formFactor = "Over Ear";
		static int price = 599;
	public static void main(String args []){
		
		System.out.println("The brand of Electronics is "+brand);
	    System.out.println("The color of the Electronics is "+color);
		System.out.println("The form factor  of the Electronics is "+formFactor);
		System.out.println("The price of the Electronics are "+price);
		
		updateElectronics();
		
		 // brand ="Dell";
		 // color = "Grey";
		 // formFactor = "Over Ear";
		 // price = 899;
		
		System.out.println("The brand of Electronics is "+brand);
	    System.out.println("The color of the Electronics is "+color);
		System.out.println("The form factor  of the Electronics is "+formFactor);
		System.out.println("The price of the Electronics are "+price);
		
	}
	
	public static void updateElectronics(){
		brand ="Dell";
		 color = "Grey";
		 formFactor = "Over Ear";
		 price = 899;
	}
}