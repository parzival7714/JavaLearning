import java.util.Arrays;

public class Question {
    private int id;
    private String question;
    private String opt[];
    private String answer;
    public int getId() {
        return id;
    }
    public Question(int id, String question, String[] opt, String answer) {
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.answer = answer;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", opt=" + Arrays.toString(opt) + ", answer=" + answer
                + "]";
    }
    public String[] getOpt() {
        return opt;
    }
    public void setOpt(String[] opt) {
        this.opt = opt;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
