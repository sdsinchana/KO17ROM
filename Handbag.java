class Handbag{
	
		static String type ="Zipper";
		static 	String material = "Polyurethane";
	static 	String style ="Handbag";
		static int noOfPocket = 4;
		
	public static void main(String args []){
		System.out.println("The type of the Handbag is "+type);
		System.out.println("The material of the Handbag is "+material);
		System.out.println("The static of the Handbag is "+style);
		System.out.println("The number of pocket in the Handbag is "+noOfPocket);
		
		updateHandbag();
		
		 // type ="Botton";
		 // material = "Lather";
		 // style ="Handbag";
		 // noOfPocket = 6;
		
		System.out.println("The type of the Handbag is "+type);
		System.out.println("The material of the Handbag is "+material);
		System.out.println("The static of the Handbag is "+style);
		System.out.println("The number of pocket in the Handbag is "+noOfPocket);
	}
	
	public static void updateHandbag(){
		type ="Botton";
		 material = "Lather";
		 style ="Handbag";
		 noOfPocket = 6;
	}
}