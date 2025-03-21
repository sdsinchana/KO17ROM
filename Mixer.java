class Mixer {
    static boolean isPoweredOn = false;
    static int speedLevel; 
    static int maxSpeed = 7;
    static int minSpeed;

    public static void onOrOff() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Mixer  is On");
        } 
		else {
            isPoweredOn = false;
            System.out.println("Mixer is Off");
        }
		return;
    }

    public static void increaseSpeed() {
        if (isPoweredOn == true) {
            if (speedLevel < maxSpeed) {
                speedLevel = speedLevel  + 1;
                System.out.println("Mixer Speed is  " + speedLevel);
            } 
			else {
                System.out.println("Maximum Speed reached");
            }
        } else {
            System.out.println("Please turn on the Mixer");
        }
		return;
    }

    public static void decreaseSpeed() {
        if (isPoweredOn == true) {
            if (speedLevel > minSpeed) {
                speedLevel = speedLevel - 1;
                System.out.println("Mixer Speed is " + speedLevel);
            }
			else {
                System.out.println("Minimum Speed reached");
            }
        }
		else {
            System.out.println("Please turn on the Mixer");
        }
		return;
    }
}


