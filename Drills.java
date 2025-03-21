class Drills{
	
		static String brand = "Mitsuki";
		static String vol = "12v";
		static String color = "Blue";
		static String speed = "1300 RPM";
	public static void main(String args []){
		
		System.out.println("The brand of Drills is "+brand);
	    System.out.println("The volume of the Drills is "+vol);
		System.out.println("The color of the Drills is "+color);
		System.out.println("The speed of the Drills are "+speed);
		
		updateDrills();
		
		 // brand = "HJVHGKJH";
		 // vol = "20v";
		 // color = "Red";
		 // speed = "750RPM";
		
		System.out.println("The brand of Drills is "+brand);
	    System.out.println("The volume of the Drills is "+vol);
		System.out.println("The color of the Drills is "+color);
		System.out.println("The speed of the Drills are "+speed);
		
	}
	public static void updateDrills(){
		brand = "HJVHGKJH";
		 vol = "20v";
		 color = "Red";
		 speed = "750RPM";
	}
}