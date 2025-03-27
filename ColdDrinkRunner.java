class ColdDrinkRunner{
	public static void main(String args[]){
	
	ColdDrink drinkOne = new ColdDrink();
	drinkOne.id = 1;
	drinkOne.company = "Coca-Cola";
	drinkOne.yearOfManufacture = 2022;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkOne.id );
	System.out.println("Company "+drinkOne.company );
	System.out.println("Year of Manufacture "+drinkOne.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkTwo = new ColdDrink();
	drinkTwo.id = 2;
	drinkTwo.company = "Pepsi";
	drinkTwo.yearOfManufacture = 2021;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkTwo.id );
	System.out.println("Company "+drinkTwo.company );
	System.out.println("Year of Manufacture "+drinkTwo.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkThree = new ColdDrink();
	drinkThree.id = 3;
	drinkThree.company = "Sprite";
	drinkThree.yearOfManufacture = 2023;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkThree.id );
	System.out.println("Company "+drinkThree.company );
	System.out.println("Year of Manufacture "+drinkThree.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkFour = new ColdDrink();
	drinkFour.id = 4;
	drinkFour.company = "Fanta";
	drinkFour.yearOfManufacture = 2020;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkFour.id );
	System.out.println("Company "+drinkFour.company );
	System.out.println("Year of Manufacture "+drinkFour.yearOfManufacture );
	System.out.println();

	ColdDrink drinkFive = new ColdDrink();
	drinkFive.id = 5;
	drinkFive.company = "Mountain Dew";
	drinkFive.yearOfManufacture = 2019;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkFive.id );
	System.out.println("Company "+drinkFive.company );
	System.out.println("Year of Manufacture "+drinkFive.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkSix = new ColdDrink();
	drinkSix.id = 6;
	drinkSix.company = "Thums Up";
	drinkSix.yearOfManufacture = 2023;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkSix.id );
	System.out.println("Company "+drinkSix.company );
	System.out.println("Year of Manufacture "+drinkSix.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkSeven = new ColdDrink();
	drinkSeven.id = 7;
	drinkSeven.company = "Mirinda";
	drinkSeven.yearOfManufacture = 2018;
	System.out.println("By no parameter constructor");
	System.out.println("Id "+drinkSeven.id );
	System.out.println("Company "+drinkSeven.company );
	System.out.println("Year of Manufacture "+drinkSeven.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkOneWPC =new ColdDrink(1,"Coca-Cola",2022);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkOneWPC.id );
	System.out.println("Company "+drinkOneWPC.company );
	System.out.println("Year of Manufacture "+drinkOneWPC.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkTwoWPC =new ColdDrink(2,"Pepsi",2021);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkTwoWPC.id );
	System.out.println("Company "+drinkTwoWPC.company );
	System.out.println("Year of Manufacture "+drinkTwoWPC.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkThreeWPC =new ColdDrink(3,"Sprite",2023);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkThreeWPC.id );
	System.out.println("Company "+drinkThreeWPC.company );
	System.out.println("Year of Manufacture "+drinkThreeWPC.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkFourWPC =new ColdDrink(4,"Fanta",2020);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkFourWPC.id );
	System.out.println("Company "+drinkFourWPC.company );
	System.out.println("Year of Manufacture "+drinkFourWPC.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkFiveWPC =new ColdDrink(5,"Mountain Dew",2019);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkFiveWPC.id );
	System.out.println("Company "+drinkFiveWPC.company );
	System.out.println("Year of Manufacture "+drinkFiveWPC.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkSixWPC =new ColdDrink(6,"Thums Up",2023);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkSixWPC.id );
	System.out.println("Company "+drinkSixWPC.company );
	System.out.println("Year of Manufacture "+drinkSixWPC.yearOfManufacture );
	System.out.println();
	
	ColdDrink drinkSevenWPC =new ColdDrink(7,"Mirinda",2018);
	System.out.println("By parameter constructor");
	System.out.println("Id "+drinkSevenWPC.id );
	System.out.println("Company "+drinkSevenWPC.company );
	System.out.println("Year of Manufacture "+drinkSevenWPC.yearOfManufacture );
	System.out.println();
	}
}
