class Processor{ 

	static int id = 12;
	static String name = "AMD 5000 Series Ryzen 5";
	static int gen = 5;
	static int clockSpeed = 5;
	
	public static void main(String args[]){
		System.out.println("The id of Processor is"+id);
	System.out.println("The name of the Processor is "+name);
	System.out.println("The generation of the Processor is "+gen);
	System.out.println("The clockspeed of the Processor is "+clockSpeed);
	
	updateProcessor();
		
	 id = 45;
	 name = "intel 5";
	 gen = 4;
	 clockSpeed = 6;
	
	
	System.out.println("The id of Processor is"+id);
	System.out.println("The name of the Processor is "+name);
	System.out.println("The generation of the Processor is "+gen);
	System.out.println("The clockspeed of the Processor is "+clockSpeed);
	
	}
	public static void updateProcessor(){
		id = 45;
	 name = "intel 5";
	 gen = 4;
	 clockSpeed = 6;
	}
	}