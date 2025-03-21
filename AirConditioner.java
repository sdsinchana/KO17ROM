class AirConditioner{
	static boolean isConnected = false;
	static int currentTempValue;
    static int maxTemp = 6;
	static int minTemp;
	
	public static void onOrOff(){        
	
	if(isConnected==false){
		isConnected=true;
		System.out.println("AC is ON");
	}
	else{
		isConnected = false;
		System.out.println("AC is OFF");
	}
	return;
	}
	
	public static void increaseTemperature(){
	
		if (isConnected==true){
			if (currentTempValue < maxTemp){
				currentTempValue = currentTempValue+1;
			
				System.out.println("Current temp is "+currentTempValue);
		    }
		
			else {
				System.out.println("Max temp reached");
		    }
		}
		else{
			System.out.println("Turn on the AC");
		}
		return;
	}
	

	
	public static void decreaseTemperature(){
	
		if (isConnected==true){
			if (currentTempValue > minTemp){
				currentTempValue = currentTempValue+1;
			
			System.out.println("Current temp is "+currentTempValue);
		    }
		
			else {
				System.out.println("Min temp reached");
		}
		}
		else{
			System.out.println("Turn on the AC");
		}
		
	
	return;
}
	
}