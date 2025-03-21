class Swiggy{
	public static String takeOrder(String item){
		double order=0.0;
		String message = null;
		if(item =="Pizza"){
			order = 99.0;
			message = "Order successfull"; 
		}
		else 
			message = "Item not found";
		return message;	
	}
	public static boolean takeOrder(String item , double quantity){
		boolean isOrderSuccess = false;
		double order= 0.0;
		
		if (item=="Pizza" ){
			order = 99.0 * quantity;
			isOrderSuccess = true;
			}
		else 
			System.out.println("Provide the valid quantity");
		return isOrderSuccess;
	}
}