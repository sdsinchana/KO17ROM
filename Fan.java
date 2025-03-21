class Fan {
    static boolean isPoweredOn = false;
    static int speedLevel; 
    static int maxSpeed = 5;
    static int minSpeed;

    public static void onOrOff() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Fan is On");
        } 
		else {
            isPoweredOn = false;
            System.out.println("Fan is Off");
        }
		return;
    }

    public static void increaseSpeed() {
        if (isPoweredOn == true) {
            if (speedLevel < maxSpeed) {
                speedLevel = speedLevel  + 1;
                System.out.println("Fan Speed is  " + speedLevel);
            } 
			else {
                System.out.println("Maximum Speed reached");
            }
        } else {
            System.out.println("Please turn on the Fan");
        }
		return;
    }

    public static void decreaseSpeed() {
        if (isPoweredOn == true) {
            if (speedLevel > minSpeed) {
                speedLevel = speedLevel - 1;
                System.out.println("Fan Speed is " + speedLevel);
            }
			else {
                System.out.println("Minimum Speed reached");
            }
        }
		else {
            System.out.println("Please turn on the Fan");
        }
		return;
    }
}


