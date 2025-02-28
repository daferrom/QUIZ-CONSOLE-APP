import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    /* constructor
    */
    public QuestionService()
    {
        questions[0] = new Question(1, "What's the programing language created in 1995", "Java","C++","Python","Rust", "Java");
        questions[1] = new Question(2, "How many bytes has an 'int' in Java", "32", "64", "16", "4", "4");
        questions[2] = new Question(3, "How many bytes has 'double' in Java", "8","16","32","64", "8");
        questions[3] = new Question(5, "How many bytes has 'char' in Java","2","4","8","16","2" );
        questions[4] = new Question(5, "How many bytes has 'long' in Java", "8","16","32","64", "8");
    }

    public void playQuiz()
    {   
        int i=0;
        for(Question q : questions)
        {
            System.out.println("Question No:" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection)
        {
            System.out.println(s);
        }
    }

    public void printScore()
        {
            int score = 0;

            for(int i =0;i<questions.length;i++)
            {
                Question question = questions[i];
                String actualAnswer = question.getAnswer();
                String userAnswer = selection[i];

                if(actualAnswer.equals(userAnswer))
                {
                    score++;
                }
            }

            System.out.println("Your score is : " + score);
        }
}
