class TeaStall{
	static String name="Baba's Tea Stall";
	//name="ref";  //Invalid statement
	public static void main(String args[]){
	
	System.out.println("The Tea Stall name is :"+name);
	updateName();
	//name="Babu's Tea Stall";
	System.out.println("Name after re-init");
	System.out.println("The Tea Stall name is :"+name);
	}
	public static void updateName(){
		//Valid statement to Re-init(override/update) the reference
		name="Babu's Tea Stall";
	}
}