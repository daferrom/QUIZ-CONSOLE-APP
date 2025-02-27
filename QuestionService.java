public class QuestionService {

    Question[] questions = new Question[5];

    /* constructor
    */
    public QuestionService()
    {
        questions[0] = new Question(1, "What's the programing language created in 1995", "Java","C++","Python","Rust", "Java");
        questions[1] = new Question(2, "How many bytes has an 'int' in Java", "32", "64", "16", "4", "4");
        questions[2] = new Question(3, "How many bytes has 'double' in Java", "8","16","32","64", "8");
        questions[3] = new Question(1, "How many bytes has 'char' in Java","2","4","8","16","2" );
        questions[4] = new Question(1, "How many bytes has 'long' in Java", "8","16","32","64", "8");
    }

    public void displayQuestions()
    {
        for(Question q : questions)
        {
            System.out.println(q);
        }
      
    }
}
