import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	Key k1 = new Key("key1");
	Key k2 = new Key("key2");
	List listQuestion = new ArrayList<>();
	listQuestion.add(new Question("1+1", "1", "2", "3", "4", "2"));
	listQuestion.add(new Question("2+2", "1", "2", "3", "4", "4"));
	listQuestion.add(new Question("1+2", "1", "2", "3", "4", "3"));
	listQuestion.add(new Question("1+0", "1", "2", "3", "4", "1"));

	Game g2 = new Quiz("Question", k1, k2, listQuestion);
	GameRunner gr1 = new GameRunner(k1, "2 3 30 59");

	boolean result = gr1.playGame(g2);
	System.out.println("Result:" + result);
    }
}