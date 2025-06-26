import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Observable{

    private String name;
    private List<Observer> suscriberList;

    public NewsPaper(String name) {
        this.name = name;
        suscriberList = new ArrayList<>();
    }
    public void publish(){
        System.out.println("new article now online");
        notifyAllObservers();
    }
    @Override
    public void notifyAllObservers() {
        for (Observer observer : suscriberList) {
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        suscriberList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        suscriberList.remove(observer);
    }
}
