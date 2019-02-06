import java.util.ArrayList;
import java.util.List;

public class LocationHandler {
    private List<LocationListener> listeners;

    public LocationHandler() {
	listeners = new ArrayList<>();
    }

    public void registerListener(LocationListener listener) {
	listeners.add(listener);
    }

    public void unregisterListener(LocationListener listener) {
	listeners.remove(listener);
    }

    public void clearListeners() {
	listeners.clear();
    }

    public void enableGps() {
	for (LocationListener l : listeners)
	    l.onGpsEnabled();
    }

    public void disableGps() {
	for (LocationListener l : listeners)
            l.onGpsDisabled();
    }

    public void changeLocation(String newLocation) {
	for (LocationListener l : listeners)
            l.onLocationChanged(newLocation);
    }
}