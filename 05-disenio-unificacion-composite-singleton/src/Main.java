//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompleteObject completeObject = new CompleteObject();
        completeObject.addGeometricFigure("Circle");
        completeObject.addGeometricFigure("Square");
        completeObject.addGeometricFigure("Triangle");
        completeObject.addGeometricFigure("Rectangle");

        System.out.println(completeObject.calculateTotalArea());
    }
}