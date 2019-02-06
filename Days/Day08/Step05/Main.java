public class Main {
    public static void main(String[] args) {
	Smartphone smartphone = new Smartphone();

	Watch watch = new Watch();

	LocationHandler handler = new LocationHandler();

	handler.registerListener(smartphone);
	handler.registerListener(watch);

	handler.enableGps();
	handler.disableGps();
	handler.changeLocation("40.464, 17.16654");

	handler.unregisterListener(watch);

	handler.enableGps();
	handler.disableGps();
	handler.changeLocation("40.464, 17.16656");
    }
}