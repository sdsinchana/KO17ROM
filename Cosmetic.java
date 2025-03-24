class Cosmetic{

 String brandAndType;
 String skinType;
 boolean isWaterproof;

 Cosmetic(){
 System.out.println("constructor is invoked");
 }

 Cosmetic(String brandAndType, String skinType, boolean isWaterproof){
 this.brandAndType = brandAndType;
 this.skinType = skinType;
 this.isWaterproof = isWaterproof;
 
 System.out.println("constructor is invoked");
 }
}