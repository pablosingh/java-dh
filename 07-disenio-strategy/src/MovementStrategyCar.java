public class MovementStrategyCar implements MovementStrategy{

    private Boolean traffic;

    public MovementStrategyCar(Boolean traffic) {
        this.traffic = traffic;
    }

    @Override
    public Double calculateTime(Double distance) {
        if (traffic){
            return distance/40;
        }else {
            return distance/80;
        }
    }
}
