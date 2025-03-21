class Smartwatch{
	
	static String id = "12QW";
	static String brand = "Noise";
	static String color = "Cream Pink";
	static String type = "Solar ";
	static String shape = "Rectangle";
	static boolean isWaterProof = true;
	
	public static void main(String args[]){
		
		System.out.println("The Smartwatch id is "+id);
		System.out.println("The Smartwatch brand is "+brand);
		System.out.println("The color is "+color);
		System.out.println("The type is  "+type);
		System.out.println("The shape is "+shape);
		System.out.println("The Smartwatch is waterproof "+isWaterProof);
		
		updateSmartwatch();
		
	 // id = "20QW";
	 // brand = "Not Applicable";
	 // color = "Purple";
	 // type = "Chain ";
	 // shape = "Circle";
	 // isWaterProof = false;
	
		System.out.println("The Smartwatch id is "+id);
		System.out.println("The Smartwatch brand is "+brand);
		System.out.println("The color is "+color);
		System.out.println("The type is  "+type);
		System.out.println("The shape is "+shape);
		System.out.println("The Smartwatch is waterproof "+isWaterProof);
		}
		
		public static void updateSmartwatch(){
			 id = "20QW";
			 brand = "Not Applicable";
			 color = "Purple";
			 type = "Chain ";
			 shape = "Circle";
			 isWaterProof = false;
		}
		}
	