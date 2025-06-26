public interface Observable {

    public void notifyAllObservers();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
