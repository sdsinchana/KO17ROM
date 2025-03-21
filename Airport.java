class Airport {
	static String id = "A45E";
	static String name = "Kempegowda International Airport";
	static String location = "Bengalore";
	static int noOfTerminals = 6;
	static String type = "Domestic";
	
	
	public static void main(String args[]){
		
	System.out.println("The id of airport is "+id);
	System.out.println("The name of the airport is "+name);
	System.out.println("The location of the airport is "+location);
	System.out.println("The number of terminals are "+noOfTerminals);
	System.out.println("The type is "+type);
	
	
	 // id = "B54I";
	 // name = "Delhi International Airport";
	 // location = "Delhi";
	 // noOfTerminals = 5;
	 // type = "International";
	 
	 updateAirport();
	
	
	System.out.println("The id of airport is "+id);
	System.out.println("The name of the airport is "+name);
	System.out.println("The location of the airport is "+location);
	System.out.println("The number of terminals are "+noOfTerminals);
	System.out.println("The type is "+type);
	}
	public static void updateAirport(){
	 id = "B54I";
	 name = "Delhi International Airport";
	 location = "Delhi";
	 noOfTerminals = 5;
	 type = "International";
	}
	}