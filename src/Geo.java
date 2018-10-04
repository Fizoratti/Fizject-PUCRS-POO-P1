public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double lat) {
        this.latitude = lat;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public void setLatitude(double lon) {
        this.longitude = lon;
    }

    @Override
    public String toString() {
        return "(lat) "+getLatitude()+" (lon) "+getLongitude();
    }
}