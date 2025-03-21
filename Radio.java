class Radio{
	
		static String brand = "Amkette";
		static String color ="Black";
		static String technology = "Bluetooth";
		static int price = 1200;
		
	public static void main(String args []){
		
		System.out.println("The brand of the Radio is "+brand);
		System.out.println("The color of the Radio is "+color);
		System.out.println("The technology of the Radio used is "+technology);
		System.out.println("The price of the Radio is "+price);
		
		updateRadio();
		
		 brand = "NHGJH";
		 color ="MixedColor";
		 technology = "Wired";
		 price = 12000;
		
		System.out.println("The brand of the Radio is "+brand);
		System.out.println("The color of the Radio is "+color);
		System.out.println("The technology of the Radio used is "+technology);
		System.out.println("The price of the Radio is "+price);
	}
	
	public static void updateRadio(){
		 brand = "NHGJH";
		 color ="MixedColor";
		 technology = "Wired";
		 price = 12000;
	}
}
		