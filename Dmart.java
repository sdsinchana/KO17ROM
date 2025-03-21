// class Dmart{
	// public static void main(String args[]){
		
		// String fruits[]={"strawberry","blueberry","DragonFruit","Watermelon","Kiwi","Muskmelon","Chikku"};
		// String stationary []={"pen","Pencil","Eraser","Highlighters","Markers","Stapler","Staples","Glue"};
		// String alcohols[]={"black&white","red bull","imperial blue"};
		
		// System.out.println("Total no. of Fruits "+fruits.length);
		// System.out.println("List of Fruits are:");
		
		//  -- > System.out.println("The Fruits available:"+fruits[0]+","+fruits[1]+","+fruits[2]+","+fruits[3]+","+fruits[4]+","+fruits[5]+","+fruits[6]);
		
		//  --        >external reference
		// for(String fruit:fruits){
			// System.out.println(fruit);
			
		// }
		
		
		// System.out.println("Total no. of stationary "+stationary.length);
		// System.out.println("List of stationary are:");
		//  -- >System.out.println("The Stationary available:"+stationary[0]+","+stationary[1]+","+stationary[2]+","+stationary[3]+","+stationary[4]+","+stationary[5]+","+stationary[6]+","+stationary[7]);
		// for(String stationary1:stationary){
			// System.out.println(stationary1);
		// }
		
		
		// System.out.println("Total no. of alcohols "+alcohols.length);
		// System.out.println("List of Alcohols are:");
		//  -- >System.out.println("The Alcohols available:"+alcohols[0]+","+alcohols[1]+","+alcohols[2]);
		// for (String alcohol : alcohols){
			// System.out.println(alcohol);
		// }
	// }

// }


class Dmart{
	static String fruits[]={"Strawberry","Chikku","Blueberry","Kiwi"};
	static String stationary[]={"Pen","Pencil","Eraser","Marker"};
	static String alcohols[]={"black&white","red bull","imperial blue"};
	public static void main(String args[]){
		System.out.println("Start of main");
		getFruits();
		getStationary();
		getAlcohols();
		System.out.println("End of main");	
	}
	
	public static void getFruits(){
		System.out.println("Start of getFruits()");
		System.out.println("The List of Fruits are: ");
		for (String fruit:fruits){
			System.out.println(fruit);
			
		}
		System.out.println("End of getFruits()");
	}
	
	public static void getStationary(){
		System.out.println("----------------------");
		System.out.println("Start of getStationary()");
		System.out.println("The List of Stationary are :");
		for(String station:stationary){
			System.out.println(station);
			
		}
		System.out.println("End of getStationary()");
	}
	public static void getAlcohols(){
		System.out.println("------------------------");
		System.out.println("Start of getAlcohols()");
		System.out.println("The List of Alcohols are :");
		for(String alcohol:alcohols){
			System.out.println(alcohol);
		}
		System.out.println("End of Alcohols()");
	}
}