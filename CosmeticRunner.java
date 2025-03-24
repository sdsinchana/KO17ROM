class CosmeticRunner{

  public static void main(String []makeup){
  
  
 Cosmetic cos1 = new Cosmetic();
 cos1.brandAndType="MAC, Foundation";
 cos1.skinType="oily";
 cos1.isWaterproof=true;
 System.out.println("brand And Type :"+cos1.brandAndType);
 System.out.println("skinType  :"+cos1.skinType);
 System.out.println("Waterproff :"+cos1.isWaterproof);
 

 Cosmetic cos2 = new Cosmetic();
 cos2.brandAndType="Maybelline, compact ";
 cos2.skinType="all skin type";
 cos2.isWaterproof=true;
 System.out.println("brand And Type :"+cos2.brandAndType);
 System.out.println("skinType :"+cos2.skinType);
 System.out.println("Waterproof  :"+cos2.isWaterproof);
 
 
 Cosmetic cos3 = new Cosmetic();
 cos3.brandAndType="Lakme, concelear";
 cos3.skinType="dry";
 cos3.isWaterproof=false;
 System.out.println("brand And Type :"+cos3.brandAndType);
 System.out.println("skinType  :"+cos3.skinType);
 System.out.println("Waterproof  :"+cos3.isWaterproof);
 
 
 Cosmetic cos4 = new Cosmetic();
 cos4.brandAndType="MyGlam, colourCrrocter";
 cos4.skinType="senstive";
 cos4.isWaterproof=true;
 System.out.println("brandAndType :"+cos4.brandAndType);
 System.out.println("skinType  :"+cos4.skinType);
 System.out.println("Waterproof  :"+cos4.isWaterproof);
 

 Cosmetic cos5 = new Cosmetic();
 cos5.brandAndType="biotique ,sunscreem";
 cos5.skinType="senstive";
 cos5.isWaterproof=false;
 System.out.println("brandAndType :"+cos5.brandAndType);
 System.out.println("skinType  :"+cos5.skinType);
 System.out.println("Waterproof  :"+cos5.isWaterproof);
 
    
     Cosmetic cos6 = new Cosmetic("minimiist ,vitamin E seream", "dry", true);
     System.out.println("brandAndType :"+cos6.brandAndType);
     System.out.println("skinType :"+cos6.skinType);
     System.out.println("Waterproof  :"+cos6.isWaterproof);
 
     
     Cosmetic cos7 = new Cosmetic("l'oreal paris ,primer","all skin type" , true);
     System.out.println("brandAndType :"+cos7.brandAndType);
     System.out.println("skinType  :"+cos7.skinType);
     System.out.println("Waterproof  :"+cos7.isWaterproof);
 
  
  }
}