//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompleteObject completeObject = new CompleteObject();
        completeObject.addGeometricFigure(GeometricFigureFactory.CODE_CIRCLE);
        completeObject.addGeometricFigure(GeometricFigureFactory.CODE_SQUARE);
        completeObject.addGeometricFigure(GeometricFigureFactory.CODE_TRIANGLE);
        completeObject.addGeometricFigure(GeometricFigureFactory.CODE_RECTANGLE);
        completeObject.addGeometricFigure("asdfasd");

        System.out.println(completeObject.calculateTotalArea());
    }
}