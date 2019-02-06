public class Watch implements LocationListener {
    public Watch() {
    }

    public void onLocationChanged(String newLocation) {
	System.out.println("Watch: onLocationChanged: " + newLocation);
    }

    public void onGpsEnabled() {
	System.out.println("Watch: onGpsEnabled");
    }

    public void onGpsDisabled() {
	System.out.println("Watch: onGpsDisabled");
    }
}