// class CharRef {
    // public static void main(String args[]) {
 
        // char charArray[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        // System.out.println("The number of Character are: "+charArray.length);
        // System.out.println("The Character's are :"+charArray[0]+","+charArray[1]+","+charArray[2]+
							// ","+charArray[3]+","+charArray[4]+","+charArray[5]+
							// ","+charArray[6]+","+charArray[7]+","+charArray[8]+","+charArray[9]);
    // }
// }

class CharRef{
	static char charArray[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	public static void main (String args[]){
		System.out.println("Start of main");
		getCharArray();
		System.out.println("End of main");
	}
	public static void getCharArray(){
		System.out.println("Beginning of getCharArray()");
		for(char chararr:charArray){
			System.out.println(chararr);
		}
		System.out.println("End of getCharArray()");
	}
}
