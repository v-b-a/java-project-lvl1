package hexlet.code.games;

public class Calc {
    public static void exercise() {
        System.out.println("What is the result of the expression?");
    }
    public static String question() {

        int randomNumber1 = (int) Math.floor(Math.random() * 100);
        int randomNumber2 = (int) Math.floor(Math.random() * 100);
        int randomOperationNumber = (int) Math.floor(Math.random() * (3-1+1)+1);
        String result = null;
        int correctAnswerInt = 0;
        if (randomOperationNumber == 1) {
            result = randomNumber1 + " - " + randomNumber2;
            correctAnswerInt = randomNumber1 - randomNumber2;
        } else if (randomOperationNumber == 2) {
            result = randomNumber1 + " + " + randomNumber2;
            correctAnswerInt = randomNumber1 + randomNumber2;
        } else if (randomOperationNumber == 3) {
            result = randomNumber1 + " * " + randomNumber2;
            correctAnswerInt = randomNumber1 * randomNumber2;
        }
        System.out.println("Question: " + result);
        return correctAnswerInt+"";
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = (int) Math.floor(Math.random()*100);
//            result.append(randomNumber + " ");
//        }
    }
}
