public class Location {
    private Double latitude;
    private Double longitud;

    public Location(Double latitude, Double longitud) {
        this.latitude = latitude;
        this.longitud = longitud;
    }
    public Double calculateDistance (Location location){
        Double latitudDistance = Math.pow(this.latitude - location.latitude, 2);
        Double longitudDistance = Math.pow(this.longitud - location.longitud, 2);
        return Math.sqrt( latitudDistance + longitudDistance);
    }
}
