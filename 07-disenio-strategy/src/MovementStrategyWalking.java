public class MovementStrategyWalking implements MovementStrategy{

    @Override
    public Double calculateTime(Double distance) {
        return distance/5;
    }
}
