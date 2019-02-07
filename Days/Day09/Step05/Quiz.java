import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Quiz extends Game {
    List<Question> questions;

    public Quiz() {
    }

    public Quiz(String name, Key keyCondition, Key keyReward, List<Question> questions) {
	super(name, keyCondition, keyReward);
	this.questions = questions;
    }

    public Key reward() {
	return(getKeyReward());
    }

    public boolean canPlay(Key k) {
	if (getKeyCondition() == null) {
	    return(true);
	}
	if (k != null && k.equals(getKeyCondition())) {
	    return(true);
	}
	return(false);
    }

    public boolean play(Key k, String input) {
	if (canPlay(k)) {
	    System.out.println("Welcome to the quiz!");

	    Scanner scan = new Scanner(input);
	    scan.useDelimiter(" ");

	    for (int i = 0; i < questions.size(); i++) {
		System.out.println(questions.get(i).getQuestion());
		System.out.println(questions.get(i).getResponse1());
		System.out.println(questions.get(i).getResponse2());
		System.out.println(questions.get(i).getResponse3());
		System.out.println(questions.get(i).getResponse4());

		if (scan.next().equals(questions.get(i).getAnswer()))
		    System.out.println("Correct");
		else {
		    System.out.println("Wrong");
		    return(false);
		}
	    }
	    System.out.println("Win");
	    return(true);
	}
	else {
	    System.out.println("Key required");
	    return(false);
	}
    }
}