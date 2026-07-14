import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[4];
    String[] selection = new String[4];

    public QuestionService() {

        questions[0] = new Questions(
                1,
                "What happens if an abstract class does not have any abstract methods?",
                "A. It will not compile.",
                "B. The class can still be abstract.",
                "C. Java will automatically provide an abstract method.",
                "B"
        );

        questions[1] = new Questions(
                2,
                "What is the default value of an uninitialized int variable declared at the class level?",
                "A. Null",
                "B. 0",
                "C. 1",
                "B"
        );

        questions[2] = new Questions(
                3,
                "Which of the following is NOT a primitive data type in Java?",
                "A. int",
                "B. boolean",
                "C. String",
                "C"
        );

        questions[3] = new Questions(
                4,
                "What is the result of the expression 5 % 2 in Java?",
                "A. 2",
                "B. 2.5",
                "C. 1",
                "C"
        );
    }

    public void playQuiz() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            Questions q = questions[i];

            System.out.println("----------------------------------");
            System.out.println("Question " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());

            System.out.print("Enter your answer (A/B/C): ");

            selection[i] = sc.nextLine().trim().toUpperCase();
        }

    
    }

    public void calcScore() {

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            String actualAnswer = questions[i].getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }

        System.out.println("\n==========================");
        System.out.println("Your Score : " + score + "/" + questions.length);
        System.out.println("==========================");
    }
}
