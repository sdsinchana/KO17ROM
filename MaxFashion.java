class MaxFashion{
	
	public static void signUp(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender ){
	boolean ref;
	
	ref = validateUserProfile(firstName, lastName,  phoneNumber,  dob,  mailId,  gender);
	if (ref == true){
		System.out.println("SIGN UP done successfully");
	}
	else{
		System.out.println("Sign Up done Unsuccessfull");
	}
	
	
}
	
	public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender){
		boolean userValidate = false;
		boolean isFirstName = false;
		boolean isLastName = false;
		boolean isPhoneNumber = false;
		boolean isDob = false;
		boolean isMailId = false;
		boolean isGender = false;
		
		if (firstName !=null &&  !firstName.isEmpty() && firstName.length() >=3){
		     isFirstName = true;
		}
		else{
		System.out.println("First name is InValid. Please provide valid First name");
		}
		
		if (lastName != null &&  !lastName.isEmpty() && lastName.length() >=1){
			isLastName = true;
		}
		else{
			System.out.println("Last name is Invalid.Please provide valid Last name");
		}
		
		if (phoneNumber !=null && !phoneNumber.isEmpty() && phoneNumber.length()>0 && phoneNumber.length()== 10 ){
			isPhoneNumber = true;
		}
		else{
			System.out.println("Phone number is Invalid.Please provide valid Phone Number");
		}
		
		if (dob != null && !dob.isEmpty()){
			isDob = true;
		}
		else{
			System.out.println("Date of Birth  is Invalid.Please provide valid Date of Birth ");
		}
		
		if (mailId != null && !mailId.isEmpty()){
			isMailId = true;
		}
		else{
			System.out.println("Mail Id is Invalid.Please provide valid Mail Id");
		}
		
		if (gender != null && !gender.isEmpty()){
			isGender = true;
		}
		else{
			System.out.println("Gender is Invalid.Please provide valid Gender");
		}
		
		
		
		if (isFirstName==true && isLastName==true && isPhoneNumber==true && isDob==true && isMailId==true && isGender==true){
			userValidate=true;
		}
		else{
			userValidate = false;
		}
		
		return userValidate;
	
	}
}