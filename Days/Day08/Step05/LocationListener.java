public interface LocationListener {
    void onLocationChanged(String newLocation);

    void onGpsEnabled();

    void onGpsDisabled();
}