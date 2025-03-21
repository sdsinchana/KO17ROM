class Fridge {
    static boolean isPoweredOn = false;
    static int coolingLevel ;
    static int maxCoolingLevel = 10;
    static int minCoolingLevel;

    public static void onOrOff() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Fridge is On");
        } 
		else {
            isPoweredOn = false;
            System.out.println("Fridge is Off");
        }
		return;
    }

    public static void increaseCoolingLevel() {
        if (isPoweredOn == true) {
            if (coolingLevel < maxCoolingLevel) {
                coolingLevel = coolingLevel + 1;
                System.out.println("Cooling Level is : " + coolingLevel);
            } 
			else {
                System.out.println("Maximum Cooling Level reached");
            }
        } 
		else {
            System.out.println("Please turn on the Fridge");
        }
		return;
    }

    public static void decreaseCoolingLevel() {
        if (isPoweredOn == true) {
            if (coolingLevel > minCoolingLevel) {
                coolingLevel = coolingLevel - 1;
                System.out.println("Cooling Level is : " + coolingLevel);
            } 
			else {
                System.out.println("Minimum Cooling Level reached");
            }
        } 
		else {
            System.out.println("Please turn on the Fridge");
        }
		return;
    }
}


