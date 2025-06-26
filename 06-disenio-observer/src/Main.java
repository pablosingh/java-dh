//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader("Peter", 16);
        Reader anotherReader = new Reader("Norman", 60);

        NewsPaper newsPaper = new NewsPaper("Periodico");
        newsPaper.addObserver(reader);
        newsPaper.addObserver(anotherReader);
        newsPaper.publish();
    }
}