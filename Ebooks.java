class Ebooks{
	
		static String name = "Locking Plates";
		static 	String author = "Anand J Thakur";
		static String format = "Kindle Edition";
		static double rating = 4.6;
		static int price = 600;
	public static void main(String args []){
		
		System.out.println("The name of the Ebooks is "+name);
		System.out.println("The author name of the Ebooks is "+author);
		System.out.println("The format of the Ebooks is "+format);
		System.out.println("The rating of the Ebooks is "+rating);
		System.out.println("The price of the Ebooks is "+price);
		
		updateEbooks();
		
		 // name = "Dive yourself";
		 // author = "Raj Putla";
		 // format = "Mage Edition";
		 // rating = 4.9;
		 // price = 1200;
		
		System.out.println("The name of the Ebooks is "+name);
		System.out.println("The author name of the Ebooks is "+author);
		System.out.println("The format of the Ebooks is "+format);
		System.out.println("The rating of the Ebooks is "+rating);
		System.out.println("The price of the Ebooks is "+price);
		
	}
	
	public static void updateEbooks(){
		name = "Dive yourself";
		 author = "Raj Putla";
		 format = "Mage Edition";
		 rating = 4.9;
		 price = 1200;
	}
}
		