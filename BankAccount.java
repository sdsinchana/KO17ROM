class BankAccount{
	static double balance;
	
	public static void credit(double amount){
		System.out.println("Credit Started");
		if (amount>0.0){
			balance = balance + amount;
		}
		else
			System.out.println("Invalid Amount");
		System.out.println("Credit Ended");
	}
	
	public static void debit(double amount){
		System.out.println("Debit Started");
		if (amount <= balance)
			balance = balance-amount;
		else
			System.out.println("Amount not sufficient");
		System.out.println("Debit Ended");
	}
	
	public static void getBalance(){
		System.out.println("The available amount is : " +balance);
		
	}
	
}