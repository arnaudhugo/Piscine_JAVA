public class Main {
    public static void main(String[] args) {

	ScannerExemple sOne = new ScannerExemple();
	sOne.scannerWithString("N W E S", 4);

	System.out.println("");
	ScannerExemple sTwo = new ScannerExemple();
	sTwo.scannerWithString("NE W E S", 3);

	System.out.println("");
	ScannerExemple sThree = new ScannerExemple();
	sThree.scannerWithString("N W E S", 1);
    }
}