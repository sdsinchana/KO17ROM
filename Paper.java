class Paper{
	
		static String brand = "Work store";
		static String color = "White";
		static String size = "A4";
		static String paperFinish = "Smooth";
		
	public static void main(String args []){
		
		System.out.println("The brand of the Paper is "+brand);
		System.out.println("The color of the paper is "+color);
		System.out.println("The size of the paper is "+size);
		System.out.println("The paper Finish of the paper is "+paperFinish);
		
		updatePapaer();
		 // brand = "Classmate";
		 // color = "White";
		 // size = "Long";
		 // paperFinish = "Always Smooth";
		
		System.out.println("The brand of the Paper is "+brand);
		System.out.println("The color of the paper is "+color);
		System.out.println("The size of the paper is "+size);
		System.out.println("The paper Finish of the paper is "+paperFinish);
	}
	public static void updatePapaer(){
		brand = "Classmate";
		 color = "White";
		 size = "Long";
		 paperFinish = "Always Smooth";
	}
}