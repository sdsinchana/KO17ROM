class ColdDrink{
	int id;
	String company;
	int yearOfManufacture;
	
	ColdDrink(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	ColdDrink(int id,String company,int yearOfManufacture){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.company = company;
		this.yearOfManufacture = yearOfManufacture;
	}
	
	
}