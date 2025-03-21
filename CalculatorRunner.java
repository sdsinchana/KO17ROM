class CalculatorRunner{
	public static void main(String args[]){
		int number = 60;
		int otherNumber = 40;
		
		int total = number + otherNumber;
		System.out.println("Addition of Two Numbers");
		Calculator.add(number,otherNumber);''''''''''''''
		 
		System.out.println("The Addition of "+ number +" and " + otherNumber + " is " +total..7);
		
		int finalValue1 = number - otherNumber;
		System.out.println("Subtraction of Two Numbers");
		Calculator.subtract(number,otherNumber);
		System.out.println("The Subtraction of "+ number +" and " + otherNumber + " is " +finalValue1);
		
		int finalValue2 = number * otherNumber;
		System.out.println("Multiplication of Two Numbers");
		Calculator.subtract(number,otherNumber);
		System.out.println("The Multiplication of "+ number +" and " + otherNumber + " is " +finalValue2);
		
		int finalValue3 = number / otherNumber;
		System.out.println("Division of Two Numbers");
		Calculator.subtract(number,otherNumber);
		System.out.println("The Division of "+ number +" and " + otherNumber + " is " +finalValue3);
		
		int finalValue4 = number % otherNumber;
		System.out.println("Modulus of Two Numbers");
		Calculator.subtract(number,otherNumber);
		System.out.println("The Modulus of "+ number +" and " + otherNumber + " is " +finalValue4);
	}
}