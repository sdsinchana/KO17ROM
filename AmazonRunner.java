class AmazonRunner{
	public static void main(String args[]){
	Amazon ref= new Amazon();
	
	ref.id = 1;
	ref.yourName = "Sinchana";
	ref.phoneNumber = 7676496955L;
	ref.password = "sinchu@2003";
	
	System.out.println("The account id is : "+ref.id);
	System.out.println("The User Name is : "+ref.yourName);
	System.out.println("The Phone Number is : "+ref.phoneNumber);
	System.out.println("The Password is : "+ref.password);
	
	
	 Amazon anotherRef = new Amazon();  // new - create a copy and also allocate memory
	 
	 anotherRef.id = 2;
	 anotherRef.yourName = "Pragna";
	 anotherRef.phoneNumber = 8104557065L;
	 anotherRef.password = "sannvi@123$";
	 
	 System.out.println("The account id is : "+anotherRef.id);
	System.out.println("The User Name is : "+anotherRef.yourName);
	System.out.println("The Phone Number is : "+anotherRef.phoneNumber);
	System.out.println("The Password is : "+anotherRef.password);
	 
	}
}