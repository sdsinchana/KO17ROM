class Projector {
    static boolean isPoweredOn = false;
    static int brightnessLevel;
    static int maxBrightness = 10;
    static int minBrightness;

    public static void onOrOff() {
        if (!isPoweredOn) {
            isPoweredOn = true;
            System.out.println("Projector is On");
        } 
		else {
            isPoweredOn = false;
            System.out.println("Projector is Off");
        }
		return;
    }

    public static void increaseBrightness() {
        if (isPoweredOn == true) {
            if (brightnessLevel < maxBrightness) {
                brightnessLevel = brightnessLevel + 1;
                System.out.println("Brightness Level is " + brightnessLevel);
            } 
			else {
                System.out.println("Maximum Brightness reached");
            }
        } 
		else {
            System.out.println("Please turn on the Projector");
        }
		return;
    }

    public static void decreaseBrightness() {
        if (isPoweredOn == true) {
            if (brightnessLevel > minBrightness) {
                brightnessLevel = brightnessLevel - 1;
                System.out.println("Brightness Level is " + brightnessLevel);
            } 
			else {
                System.out.println("Minimum Brightness reached");
            }
        } 
		else {
            System.out.println("Please turn on the Projector");
        }
		return;
    }
}

