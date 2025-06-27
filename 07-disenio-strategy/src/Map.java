public class Map {

    private Location currentLocation;
    private MovementStrategy currentStrategy;

    public Map(Location currentLocation, MovementStrategy currentStrategy) {
        this.currentLocation = currentLocation;
        this.currentStrategy = currentStrategy;
    }
    public Double calculateTimeToLocation(Location location){
        Double distance = currentLocation.calculateDistance(location);
        return currentStrategy.calculateTime(distance);
    }
    public void setCurrentStrategy(MovementStrategy movementStrategy){
        this.currentStrategy = movementStrategy;
    }
}
