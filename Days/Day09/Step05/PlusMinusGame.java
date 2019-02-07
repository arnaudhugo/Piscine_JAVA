import java.util.Scanner;

public class PlusMinusGame extends Game {
    int findValue;

    public PlusMinusGame() {
    }

    public PlusMinusGame(String name, Key keyCondition, Key keyReward, int findValue) {
	super(name, keyCondition, keyReward);
	this.findValue = findValue;
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
	    System.out.println("Welcome to the " + getName() + " game!");

	    Scanner scan = new Scanner(input);
	    scan.useDelimiter(" ");

	    while (scan.hasNextInt()) {
		int n = scan.nextInt();
		if (n < findValue)
		    System.out.println("Greater");
		else if (n > findValue)
		    System.out.println("Lower");
		else if (n == findValue) {
		    System.out.println("Win");
		    scan.close();
		    return(true);
		}
	    }
	    System.out.println("Lose");
	    scan.close();
	    return(false);
	}
	else {
	    System.out.println("Key required");
	    return(false);
	}
    }
}