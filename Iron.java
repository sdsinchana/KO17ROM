class Iron{
	static boolean isConnected = false;
	static int currentTempValue;
    static int maxTemp = 4;
	static int minTemp;
	
	public static void onOrOff(){        
	
	if(isConnected==false){
		isConnected=true;
		System.out.println("Iron Box is ON");
	}
	else{
		isConnected = false;
		System.out.println("Iron Box is OFF");
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
				System.out.println("Maximum temp reached");
		    }
		}
		else{
			System.out.println("Turn on the Iron");
		}
		return;
	}
	

	
	public static void decreaseTemperature(){
	
		if (isConnected==true){
			if (currentTempValue > minTemp){
				currentTempValue = currentTempValue-1;
			
			System.out.println("Current temp is "+currentTempValue);
		    }
		
			else {
				System.out.println("Minimum temp reached");
		}
		}
		else{
			System.out.println("Turn on the Iron");
		}
		
	
	return;
}
	
}