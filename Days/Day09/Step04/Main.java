import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	Key k = new Key("key1");
	List<Question> listQuestion = new ArrayList<>();
	listQuestion.add(new Question("1+1", "1", "2", "3", "4", "2"));
	listQuestion.add(new Question("2+2", "1", "2", "3", "4", "4"));
	Game g = new Quiz("Question", null, k, listQuestion);

	System.out.println("win:" + g.play(null, "2 4"));
	System.out.println("win:" + g.play(null, "2 1"));
    }
}