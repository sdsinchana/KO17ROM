// class DominosRunner {
    // public static void main(String args[]) {
        // String foodName = "Farmhouse Pizza";
        // Dominos.getFoodPrice(foodName);
    // }
// }

class DominosRunner{
	public static void main(String args[]){
		String order=Dominos.takeOrder("Garlic Bread");
		System.out.println(order);
		boolean orderWithQuantity = Dominos.takeOrder("Garlic Bread",3);
		System.out.println(orderWithQuantity);
	}
}