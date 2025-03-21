// class Apples{
	// public static void main(String args []){
		// String brand = "Apple";
		// String operatingSystem = "iOS 17";
		// String ramSize = "128 GB";
		// String size = "6.1 inch";
		
		// System.out.println("The brand of the Apples is "+brand);
		// System.out.println("The operatingSystem of the Apples is "+operatingSystem);
		// System.out.println("The ramSize of the Apples is "+ramSize);
		// System.out.println("The size of the Apples is "+size);
	// }
// }




class Apples{
	    static String brand = "Apple";
		static String operatingSystem = "iOS 17";
		static String ramSize = "128 GB";
		static String size = "6.1 inch";
	public static void main(String args []){
		
		System.out.println("The brand of the Devices is "+brand);
		System.out.println("The operatingSystem of the Devices is "+operatingSystem);
		System.out.println("The ramSize of the Devices is "+ramSize);
		System.out.println("The size of the Devices is "+size);
		
		updateApples();
		
		 // brand = "iOS";
		 // operatingSystem = "iOS 23";
		 // ramSize = "624 GB";
		 // size = "7.5 inch";
		
		System.out.println("The brand of the Devices is "+brand);
		System.out.println("The operatingSystem of the Devices is "+operatingSystem);
		System.out.println("The ramSize of the Devices is "+ramSize);
		System.out.println("The size of the Devices is "+size);
	}
	public static void updateApples(){
		 brand = "iOS";
		 operatingSystem = "iOS 23";
		 ramSize = "624 GB";
		 size = "7.5 inch";
	}
}