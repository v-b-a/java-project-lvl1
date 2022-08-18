package hexlet.code.games;

public class GCD {
    private static String name = "GCD";

    public static String getName() {return name;}

    public static void printExercise() {
        System.out.println("Find the greatest common divisor of given numbers.\n");
    }
    public static String question() {
        int randomNumber1 = (int)Math.floor(Math.random()*100);
        int randomNumber2 = (int)Math.floor(Math.random()*100);
        int DCGNumber = 0;
        int cycleCount = randomNumber1 < randomNumber2 ? randomNumber1 : randomNumber2;
        for (int i = 1; i <= cycleCount; i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                DCGNumber = i;
            }

        }
        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        return DCGNumber + "";
    }

}
