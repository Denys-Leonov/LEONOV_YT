package utils;

public class Utils {
    public static void waitABit(Integer second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
