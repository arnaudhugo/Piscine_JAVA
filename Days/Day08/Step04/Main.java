public class Main {
    public static void main(String[] args) {
	Smartphone smartphone = new Smartphone();
	Watch watch = new Watch();

	smartphone.onLocationChanged("14.5152, 12.1821");
	smartphone.onGpsDisabled();
	smartphone.onGpsEnabled();

	watch.onLocationChanged("25.5152, 71.1821");
	watch.onGpsDisabled();
	watch.onGpsEnabled();
    }
}