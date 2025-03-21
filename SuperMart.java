// class SuperMart {
    // public static void main(String args[]) {
       
        // String groceries[] = {"Rice", "Wheat Flour", "Sugar", "Salt", "Dal",
            // "Cooking Oil", "Tea Powder", "Coffee", "Spices", "Honey"};

        // String perfumes[] = {"Chanel No. 5", "Dior Sauvage", "Gucci Bloom", "Calvin Klein One", "Armani Code",
            // "Hugo Boss Bottled", "Versace Eros", "Burberry Brit", "Paco Rabanne 1 Million", "Tom Ford Noir"};

        // String biscuits[] = {"Oreo", "Parle-G", "Bourbon", "Hide & Seek Fab", "Good Day",
            // "Milk Bikis", "Marie Gold", "Jim Jam", "Little Debbie", "Biscoff"};

        // String utensils[] = {"Frying Pan", "Pressure Cooker", "Saucepan", "Spatula", "Ladle",
            // "Tongs", "Knife Set", "Chopping Board", "Rolling Pin", "Mixing Bowl"};

        // String vegetables[] = {"Tomato", "Potato", "Onion", "Carrot", "Cabbage",
            // "Spinach", "Capsicum", "Cauliflower", "Pumpkin", "Brinjal"};

     
        // System.out.println("The number of Groceries are: "+groceries.length);
        // System.out.println("The Groceries are :"+groceries[0]+","+groceries[1]+
							// ","+groceries[2]+","+groceries[3]+","+groceries[4]+
							// ","+groceries[5]+","+groceries[6]+","+groceries[7]+
							// ","+groceries[8]+","+groceries[9]);

        // System.out.println("The number of Perfumes are :"+perfumes.length);
		// System.out.println("The Perfumes are :"+perfumes[0]+","+perfumes[1]+
							// ","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+
							// ","+perfumes[5]+","+perfumes[6]+","+perfumes[7]+
							// ","+perfumes[8]+","+perfumes[9]);
        

        // System.out.println("The number of Biscuits are :"+biscuits.length);
        // System.out.println("The Biscuits are :"+biscuits[0]+","+biscuits[1]+
							// ","+biscuits[2]+","+biscuits[3]+","+biscuits[4]+
							// ","+biscuits[5]+","+biscuits[6]+","+biscuits[7]+
							// ","+biscuits[8]+","+biscuits[9]);

        // System.out.println("The number of Utensils are :"+utensils.length);
        // System.out.println("The Utensils are :"+utensils[0]+","+utensils[1]+
							// ","+utensils[2]+","+utensils[3]+","+utensils[4]+
							// ","+utensils[5]+","+utensils[6]+","+utensils[7]+
							// ","+utensils[8]+","+utensils[9]);

        // System.out.println("The number of Vegetables are :"+vegetables.length);
        // System.out.println("The Vegetables are :"+vegetables[0]+","+vegetables[1]+
							// ","+vegetables[2]+","+vegetables[3]+","+vegetables[4]+
							// ","+vegetables[5]+","+vegetables[6]+","+vegetables[7]+
							// ","+vegetables[8]+","+vegetables[9]);
    // }
// }


class SuperMart{
		static String groceries[] = {"Rice", "Wheat Flour", "Sugar", "Salt", "Dal",
            "Cooking Oil", "Tea Powder", "Coffee", "Spices", "Honey"};

        static String perfumes[] = {"Chanel No. 5", "Dior Sauvage", "Gucci Bloom", "Calvin Klein One", "Armani Code",
            "Hugo Boss Bottled", "Versace Eros", "Burberry Brit", "Paco Rabanne 1 Million", "Tom Ford Noir"};

        static String biscuits[] = {"Oreo", "Parle-G", "Bourbon", "Hide & Seek Fab", "Good Day",
            "Milk Bikis", "Marie Gold", "Jim Jam", "Little Debbie", "Biscoff"};

        static String utensils[] = {"Frying Pan", "Pressure Cooker", "Saucepan", "Spatula", "Ladle",
            "Tongs", "Knife Set", "Chopping Board", "Rolling Pin", "Mixing Bowl"};

        static String vegetables[] = {"Tomato", "Potato", "Onion", "Carrot", "Cabbage",
            "Spinach", "Capsicum", "Cauliflower", "Pumpkin", "Brinjal"};
			
	public static void main(String args[]){
		System.out.println("Start of main");
		getGroceries();
		getPerfumes();
		getBiscuits();
		getUtensils();
		getVegetables();
		System.out.println("End of main");
	}
	
	public static void getGroceries(){
		System.out.println("Beginning of getGroceries()");
		for(String grocery:groceries){
			System.out.println(grocery);
		}
		System.out.println("End of getGroceries()");
	}
	
	public static void getPerfumes(){
		System.out.println("-------------------------------");
		System.out.println("Beginning of getPerfumes()");
		for(String perfume:perfumes){
			System.out.println(perfume);
		}
		System.out.println("End of getPerfumes()");
	}
	
	public static void getBiscuits(){
		System.out.println("---------------------------------");
		System.out.println("Beginning of getBiscuits()");
		for(String biscuit:biscuits){
			System.out.println(biscuit);
		}
		System.out.println("End of getBiscuits()");
	}
	
	public static void getUtensils(){
		System.out.println("--------------------------------");
		System.out.println("Beginning of getUtensils()");
		for(String utensil:utensils){
			System.out.println(utensil);
		}
		System.out.println("End of getUtensils()");
	}
	
	public static void getVegetables(){
		System.out.println("--------------------------------");
		System.out.println("Beginning of getVegetables()");
		for(String vegetable:vegetables){
			System.out.println(vegetable);
		}
		System.out.println("End of getVegetables()");
	}
}
