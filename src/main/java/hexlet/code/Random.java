package hexlet.code;

public class Random {
    private static final int minValue = 1;
    public static int generateRandomNumber(int maxValue) {
        return (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
    }
}
