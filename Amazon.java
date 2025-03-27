class Amazon{
	
	int id;
	String firstName;
	long phoneNumber;
	String password;      
	
	
	Amazon(){
		System.out.println("No Paramater Constructor is invoking");
	}
	
	Amazon(int id , String firstName, long phoneNumber, String password){
		System.out.println("Parameter Constructor is invoked");a
		
		this.id = id;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.password = password;ss
	}
	
	public void getAmazonDetails(){ //method
		//instance variable -- this
		System.out.println("The id number is :"+this.id);
		System.out.println("The First Name is : "+this.firstName);
		System.out.println("The Phone number is :" +this.phoneNumber);
		System.out.println("The Password is :"+this.password);
		
		
	}
}