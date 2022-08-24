package hexlet.code;

public class Random {
    private static final int MIN_VALUE = 1;
    public static int generateRandomNumber(int maxValue) {
        return (int) Math.floor(Math.random() * (maxValue - MIN_VALUE + 1) + MIN_VALUE);
    }
}
