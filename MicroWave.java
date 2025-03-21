class MicroWave {
	
	static String microName = "IFB";
	static String color ="Black";
	static int price = 5420;
	static boolean isWaterproof = false;
	
	public static void main(String args[]){
		
	System.out.println("The name of the MicroWave is : "+microName);
	System.out.println("Color of the MicroWave is : "+color);
	System.out.println("It's cost is : "+price);
	System.out.println("MicroWave is Waterproof : "+isWaterproof);
	
	updateMicroWave();
	 // microName = "Bajaj";
	 // color ="White";
	 // price = 4500;
	 // isWaterproof = true;
	
	System.out.println("The name of the MicroWave is : "+microName);
	System.out.println("Color of the MicroWave is : "+color);
	System.out.println("It's cost is : "+price);
	System.out.println("MicroWave is Waterproof : "+isWaterproof);
	}
	
	public static void updateMicroWave(){
		microName = "Bajaj";
	 color ="White";
	 price = 4500;
	 isWaterproof = true;
	}
}