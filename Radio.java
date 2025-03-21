class Radio{
	static boolean isConnected = false;
	static int currentVolume;
	static int maxVolume = 10;
	static int  minVolume;
	
	public static void onOrOff(){
		if (isConnected == false){
			isConnected= true ;
			System.out.println("Radio is On");
		}
		else{
			System.out.println("Radio is Off");
		}
		return;
	}
	
	public static void increaseVolume(){
		if(isConnected == true){
			if (currentVolume < maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("The Current Volume is :"+ currentVolume);
			}
			else {
				System.out.println("Maximum Volume reached");
		}
	}
	else{
		System.out.println("Please turn on the Volume");
	}
	return;
	}

	public static void decreaseVolume(){
		if(isConnected == true){
			if (currentVolume < maxVolume){
				currentVolume = currentVolume-1;
				System.out.println("The Current Volume is :"+ currentVolume);
			}
			else {
				System.out.println("Maximum Volume reached");
		}	
		}
		else{
		System.out.println("Please turn on the Volume");
	}
	return;
	}
}