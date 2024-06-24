package Quiz;
import java.util.*;
public class Codsoft_task4 {
    private static String[] questions={
            "What is the Capital of France?",
            "Which planet is known as the red planet?",
            "What is the largest mammal on Earth?"
    };

    private static String[][] options={
            {"A. Paris","B. Rome","C. London"},
            {"A. Jupiter","B. Saturn","C. Mars"},
            {"A. Elephant","B. Blue whale","C. Girrafe"}
    };

    private static char[] answers={'A','B','C'};
    private static int Score=0;

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<questions.length;i++){
            System.out.println("Question "+(i+1)+": "+questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your answer (A,B,C ): ");
            char useranswer=sc.nextLine().toUpperCase().charAt(0);
            if(useranswer==answers[i]){
                System.out.println("Correct!/n");
                Score++;
            }else {
                System.out.println("Incorrect . The correct answer is "+answers[i]);
            }

        }
        System.out.println("Quiz completed! Your final score is "+Score+"/"+questions.length);
    }
}
