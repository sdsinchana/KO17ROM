// class TajHotel {
    // public static void main(String args[]) {
       
        // String hotelMenus[] = {"1. Biryani, Butter Chicken, Roti","2. Pizza, Pasta, Garlic Bread",
								 //"3. Dosa, Idli, Vada, Sambar","4. Burger, Fries, Coke",
								 //"5. Dal Makhani, Paneer Butter Masala, Naan","6. Sushi, Ramen, Tempura",
								 //"7. Tacos, Burritos, Nachos","8. Steak, Mashed Potatoes, Grilled Vegetables",
								 //"9. Fish Curry, Rice, Prawns Fry","10. Chole Bhature, Rajma Chawal, Lassi"};

        // System.out.println("Total number of Menus are:"+hotelMenus.length);
		//--- >System.out.println("The Menu's are:"+hotelMenus[0]+","+hotelMenus[1]+","+hotelMenus[3]+","+hotelMenus[4]+hotelMenus[5]+","+hotelMenus[6]+","+hotelMenus[7]+","+hotelMenus[8]+","+hotelMenus[9]);
		
	// }
// }

class TajHotel{
	static String hotelMenus[]={"1. Biryani, Butter Chicken, Roti","2. Pizza, Pasta, Garlic Bread",
								 "3. Dosa, Idli, Vada, Sambar","4. Burger, Fries, Coke",
								 "5. Dal Makhani, Paneer Butter Masala, Naan","6. Sushi, Ramen, Tempura",
								 "7. Tacos, Burritos, Nachos","8. Steak, Mashed Potatoes, Grilled Vegetables",
								 "9. Fish Curry, Rice, Prawns Fry","10. Chole Bhature, Rajma Chawal, Lassi"};
	public static void main(String args[]){
		System.out.println("Start of main");
		gethotelMenus();
		System.out.println("End of main");
	}
	public static void gethotelMenus(){
		System.out.println("Start of gethotelMenus()");
		System.out.println("The List of Hotel Menus are :");
		for(String hotelMenu:hotelMenus){
			System.out.println(hotelMenu);
		}
		System.out.println("End of Hotel Menu");
	}
}
