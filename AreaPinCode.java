

class AreaPinCode{
	static int pinCodes[]={547120,695478,6354789};
		public static void main(String args[]){
		//int pinCodes[]={577101,577102,599666,564987,156987,654100,800400,654789,100600,489652};
		
		//System.out.println("The number of PinCodes : "+pinCode.length);
		//System.out.println("The PinCodes are :"+pinCode[0]+","+pinCode[1]+","+pinCode[2]+","+pinCode[3]+","+pinCode[4]+","+pinCode[5]+","+pinCode[6]+","+pinCode[7]+","+pinCode[8]+","+pinCode[9]);
		//int pinCode1 = pinCodes[0];
		//System.out.println(pinCode1);
		//int pinCode2 = pinCodes[1];
		//System.out.println(pinCode2);
		
		System.out.println("Main started");
		
		getPinCode();  //method
		
		System.out.println("Main Ended");
		
		}
		
		//looping structure --> external reference
		public static void getPinCode(){
			System.out.println("Inside getPinCode()");
			System.out.println("List of area Pincode are: ");
		for(int pinCode:pinCodes){
			System.out.println(pinCode);
			
		}
		System.out.println("Outside getPinCode()");
		 
}
}