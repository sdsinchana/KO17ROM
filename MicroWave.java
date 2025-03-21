class MicroWave {
    static boolean isPoweredOn = false;
    static int cookingTime;
    static int maxTime = 30; 
    static int minTime;

    public static void onOrOff() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Microwave is On");
        }
		else {
            isPoweredOn = false;
            System.out.println("Microwave is Off");
        }
    }

    public static void increaseTime() {
        if (isPoweredOn) {
            if (cookingTime < maxTime) {
                cookingTime = cookingTime +1;
                System.out.println("The Cooking Time is: " + cookingTime + " minutes");
            } 
			else {
                System.out.println("Maximum cooking time reached");
            }
        } 
		else {
            System.out.println("Please turn on the Microwave");
        }
		return;
    }

    public static void decreaseTime() {
        if (isPoweredOn) {
            if (cookingTime > minTime) {
                cookingTime = cookingTime - 1;
                System.out.println("The Cooking Time is: " + cookingTime + " minutes");
            } 
			else {
                System.out.println("Minimum cooking time reached");
            }
        } 
		else {
            System.out.println("Please turn on the Microwave");
        }
		return;
    }
}


