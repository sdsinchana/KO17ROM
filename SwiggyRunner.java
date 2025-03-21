class SwiggyRunner{
	public static void main(String args[]){
		String order=Swiggy.takeOrder("Pizza");
		System.out.println(order);
		boolean orderWithQuantity = Swiggy.takeOrder("Pizza",2);
		System.out.println(orderWithQuantity);
	}
}