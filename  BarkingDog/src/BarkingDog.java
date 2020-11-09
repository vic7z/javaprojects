public class BarkingDog {
    public static boolean shouldWakeUP(boolean barking, int hourOfTheDay) {
        final boolean b = false;
        if (barking) {
            if (hourOfTheDay > 0 && hourOfTheDay < 23) {
                return true;
            } else {
                return b;
            }
        } else {
            return b;
        }
    }
}
