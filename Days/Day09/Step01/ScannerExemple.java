import java.util.Scanner;

public class ScannerExemple {
    public ScannerExemple() {
    }

    public void scannerWithString(String input, int nbValue) {
	Scanner scan = new Scanner(input);
	scan.useDelimiter(" ");
	int i = 0;

	while (i < nbValue && scan.hasNextLine()) {
	    String s = scan.next();
	    System.out.println(s);
	    i++;
	}
    }
}