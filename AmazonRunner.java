class AmazonRunner{
	public static void main(String args[]){
	
	
	Amazon ref = new Amazon(1, "Sinchana", 7676496955L,"Sinchu@2003");
	System.out.println(ref);
	ref.getAmazonDetails();
	
	Amazon ref2 = new Amazon(2,"Lakshmi", 8104557035L, "snak@413");
	ref2.getAmazonDetails();
	
	Amazon ref3 = new Amazon(3,"Pragna", 4658749651L, "fwrgf@413");
	ref3.getAmazonDetails();
	
	Amazon ref4 = new Amazon(4,"Saanvi", 5698741230L, "fwef@413");
	ref4.getAmazonDetails();
	
	Amazon ref5 = new Amazon(5,"Punith", 7204631589L, "dsfqef@413");
	ref5.getAmazonDetails();
	
	}

}