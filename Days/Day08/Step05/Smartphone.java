public class Smartphone implements LocationListener {
    public Smartphone() {
    }

    public void onLocationChanged(String newLocation) {
	System.out.println("Smartphone: onLocationChanged: " + newLocation);
    }

    public void onGpsEnabled() {
	System.out.println("Smartphone: onGpsEnabled");
    }

    public void onGpsDisabled() {
	System.out.println("Smartphone: onGpsDisabled");
    }
}