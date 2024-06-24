 package Quiz;
import java.util.*;

public class Codsoft_task4{

    private static String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal on Earth?"
    };

    private static String[][] options = {
            {"A. Paris", "B. Rome", "C. London"},
            {"A. Jupiter", "B. Saturn", "C. Mars"},
            {"A. Elephant", "B. Blue Whale", "C. Giraffe"}
    };

    private static char[] answers = {'A', 'C', 'B'};

    private static int score = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static Timer timer = new Timer();
    private static boolean answered;

    public static void main(String[] args) {
        for (int i = 0; i < questions.length; i++) {
            answered = false;
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            startTimer();
            System.out.print("Enter your answer (A, B, or C): ");

            TimerTask task = new TimerTask() {
                public void run() {
                    if (!answered) {
                        System.out.println("\nTime's up! Moving to the next question.");
                        endTimer();
                        answered = true; // Set answered to true so that it moves on to the next question
                    }
                }
            };
            timer.schedule(task, 15000); // 15 seconds

            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);
            answered = true;

            endTimer();

            if (!answered) {
                System.out.println("Moving to the next question.");
            } else {
                if (userAnswer == answers[i]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + answers[i] + "\n");
                }
            }
        }

        System.out.println("Quiz completed. Your score is: " + score+"/"+questions.length);
        scanner.close();
        timer.cancel();
    }

    private static void startTimer() {
        System.out.println("Timer started.");
    }

    private static void endTimer() {
        System.out.println("Timer ended.");
    }
}
