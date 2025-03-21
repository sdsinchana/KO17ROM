class BankAccountRunner{
	public static void main(String args[]){
		
		System.out.println("Main Started");
		
		//className.methodname();
		BankAccount.getBalance();
		BankAccount.credit(5000.00);
		
		BankAccount.getBalance();
		BankAccount.debit(250.00);
		
		BankAccount.getBalance();
		
		BankAccount.credit(0.0);
		//System.out.println("The debited amount is: "+balance);
		
		System.out.println("Main Ended");
	}
}