class Cosmetics{
		static String brand = "Renee";
		static String vol = "50ml";
		static String itemForm = "Cream";
		static String useFor = "Face";
	public static void main(String args []){
		
		System.out.println("The brand of Cosmetics is "+brand);
	    System.out.println("The volume of the Cosmetics is "+vol);
		System.out.println("The items form  of the Cosmetics are "+itemForm);
		System.out.println("It is used on "+useFor);
		
		updateCosmetics();
		 // brand = "Lakme";
		 // vol = "100ml";
		 // itemForm = "Lotion";
		 // useFor = "Body";
		
		System.out.println("The brand of Cosmetics is "+brand);
	    System.out.println("The volume of the Cosmetics is "+vol);
		System.out.println("The items form  of the Cosmetics are "+itemForm);
		System.out.println("It is used on "+useFor);
	}
	public static void updateCosmetics(){
		brand = "Lakme";
		 vol = "100ml";
		 itemForm = "Lotion";
		 useFor = "Body";
	}
}