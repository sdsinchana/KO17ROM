class Fashion{
		static String material ="Chanderi";
	static	String type = "Full Sleeve";
	static	String lenght = "Calf";
	static	String country = "India";
	public static void main(String args []){
		
		System.out.println("The material of Fashion is"+material);
	    System.out.println("The type of the Fashion is "+type);
		System.out.println("The lenght of the Fashion is "+lenght);
		System.out.println("The country of the Fashion are "+country);
		
		updateFashion();
		 // material ="Jeans Top";
		 // type = "Half Sleeve";
		 // lenght = "Crop";
		 // country = "England";
		
		System.out.println("The material of Fashion is"+material);
	    System.out.println("The type of the Fashion is "+type);
		System.out.println("The lenght of the Fashion is "+lenght);
		System.out.println("The country of the Fashion are "+country);
		
	}
	public static void updateFashion(){
		material ="Jeans Top";
		 type = "Half Sleeve";
		 lenght = "Crop";
		 country = "England";
	}
}