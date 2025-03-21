class Charger{
	
	static String id = "12A";
	static String brand = "Ambrane";
	static	String color = "Blank";
	static	String power = "230 Volts";
	static	String type = "Wall Mount";
	static	int price = 300;
	static	boolean isWashable = false;
		
	public static void main(String args[]){
		
		System.out.println("The Charger id is "+id);
		System.out.println("The brand is "+brand);
		System.out.println("The color is "+color);
		System.out.println("The power is  "+power);
		System.out.println("The type is "+type);
		System.out.println("The price is "+price);
		System.out.println("The charger is washable - "+isWashable);
		
		updateCharger();
		 // id = "158P";
		 // brand = "Samsung";
		 // color = "White";
		 // power = "540 Volts";
		 // type = "Wall Mount";
		 // price = 490;
		 // isWashable = true;
		
		System.out.println("The Charger id is "+id);
		System.out.println("The brand is "+brand);
		System.out.println("The color is "+color);
		System.out.println("The power is  "+power);
		System.out.println("The type is "+type);
		System.out.println("The price is "+price);
		System.out.println("The charger is washable - "+isWashable);
		}
		
		public static void updateCharger(){
		 id = "158P";
		 brand = "Samsung";
		 color = "White";
		 power = "540 Volts";
		 type = "Wall Mount";
		 price = 490;
		 isWashable = true;
		}
	}