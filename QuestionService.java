import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", new String[]{"Paris", "London", "Berlin", "Madrid"}, "Berlin");
        questions[2] = new Question(3, "What is the capital of Spain?", new String[]{"Paris", "London", "Berlin", "Madrid"}, "Madrid");
        questions[3] = new Question(4, "What is the capital of Italy?", new String[]{"Rome", "London", "Berlin", "Madrid"}, "Rome");
        questions[4] = new Question(5, "What is the capital of UK?", new String[]{"Paris", "London", "Berlin", "Madrid"}, "London"); 
    }
    public void playQuestions()
    {
        int i = 0;
        System.out.println("Welcome to the Quiz!");
        for(Question q : questions)
        {
           System.out.println("Question No. : "+q.getId()+" "+ q.getQuestion());
           for(String opt : q.getOpt())
           {
               System.out.println(opt);
           }
           System.out.println("Please enter your answer: ");
           Scanner sc = new Scanner(System.in);
           selection[i] = sc.nextLine();
           i++;
        }
        System.out.println("Thank you for playing the quiz!");
        System.out.println("Your answers are: ");
        for(String s: selection)
        {
            System.out.println(s);
        }
        System.out.println("Your score is: "+ score());
    }
    public int score()
    {
        int score = 0;
        int i= 0;
        for(Question answer: questions)
        {
            if(answer.getAnswer().equalsIgnoreCase(selection[i]))
            {
                score = score+10;
            }
            i++;
        }
        return score;
    }

}
