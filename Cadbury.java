class Cadbury{
		static String brand = "Cadbury";
		static String itemForm = "Bar";
		static int noOfPieces = 15;
		static String flavour = "Chocolate";
		
		
	public static void main(String args []){
		
		System.out.println("The brand of the Cadbury is "+brand);
		System.out.println("The item form  of the Cadbury is "+itemForm);
		System.out.println("The number of pieces of the Cadbury is "+noOfPieces);
		System.out.println("The flavour of the Cadbury is "+flavour);
		
		updateCadbury();
		//  brand = "MilkyBar";
		//  itemForm = "Bar";
		//  noOfPieces = 20;
		//  flavour = "Strawberry";
		
		System.out.println("The brand of the Cadbury is "+brand);
		System.out.println("The item form  of the Cadbury is "+itemForm);
		System.out.println("The number of pieces of the Cadbury is "+noOfPieces);
		System.out.println("The flavour of the Cadbury is "+flavour);
	}
	
	public static void updateCadbury(){
		brand = "MilkyBar";
		 itemForm = "Bar";
		 noOfPieces = 20;
		 flavour = "Strawberry";
	}
}