// class GaneshStationary {
    // public static void main(String args[]) {
      
        // String items[] = {
			// ---> Gadgets
			// "Laptop", "Smartphone", "Tablet", "Smartwatch", "Earbuds",
            // "Bluetooth Speaker", "Camera", "Power Bank", "VR Headset", "Gaming Console",

            // --->Books
            // "The Alchemist", "1984", "To Kill a Mockingbird", "The Great Gatsby", "Harry Potter",
            // "The Lord of the Rings", "Sapiens", "The Catcher in the Rye", "Think and Grow Rich", "Atomic Habits",

            // ---> Sports
            // "Cricket Bat", "Football", "Basketball", "Tennis Racket", "Badminton Shuttlecock",
            // "Hockey Stick", "Boxing Gloves", "Golf Club", "Swimming Goggles", "Table Tennis Paddle",

            // ---> Beverages
            // "Coffee", "Tea", "Orange Juice", "Coconut Water", "Lemonade",
            // "Green Tea", "Milkshake", "Soda", "Energy Drink", "Smoothie"
        // };

        
        // System.out.println("The number of collections are: "+items.length);
		// System.out.println("The Items  are :"+items[0]+","+items[1]+
							// ","+items[2]+","+items[3]+","+items[4]+
							// ","+items[5]+","+items[6]+","+items[7]+
							// ","+items[8]+","+items[9]+","+items[10]+","+items[11]+
							// ","+items[12]+","+items[13]+","+items[14]+
							// ","+items[15]+","+items[16]+","+items[17]+
							// ","+items[18]+","+items[19]+","+items[20]+","+items[21]+
							// ","+items[22]+","+items[23]+","+items[24]+
							// ","+items[25]+","+items[26]+","+items[27]+
							// ","+items[28]+","+items[29]+","+items[30]+","+items[31]+
							// ","+items[32]+","+items[33]+","+items[34]+
							// ","+items[35]+","+items[36]+","+items[37]+
							// ","+items[38]+","+items[39]);
        
    // }
// }

class GaneshStationary{
	static String items[]={
			//Gadgets
			"Laptop", "Smartphone", "Tablet", "Smartwatch", "Earbuds",
            "Bluetooth Speaker", "Camera", "Power Bank", "VR Headset", "Gaming Console",

            //Books
            "The Alchemist", "1984", "To Kill a Mockingbird", "The Great Gatsby", "Harry Potter",
            "The Lord of the Rings", "Sapiens", "The Catcher in the Rye", "Think and Grow Rich", "Atomic Habits",

            // Sports
            "Cricket Bat", "Football", "Basketball", "Tennis Racket", "Badminton Shuttlecock",
            "Hockey Stick", "Boxing Gloves", "Golf Club", "Swimming Goggles", "Table Tennis Paddle",

            // Beverages
            "Coffee", "Tea", "Orange Juice", "Coconut Water", "Lemonade",
            "Green Tea", "Milkshake", "Soda", "Energy Drink", "Smoothie"};
			
	public static void main (String args[]){
		System.out.println("Start of main");
		getGaneshStationary();
		System.out.println("End of main");
	}
	public static void getGaneshStationary(){
		System.out.println("Beginning of getGaneshStationary()");
		for(String stationaryItem:items){
			System.out.println(stationaryItem);
		}
		System.out.println("End of getGaneshStationary()");
	}
}
