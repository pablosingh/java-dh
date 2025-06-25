import java.util.ArrayList;
import java.util.List;

public class CompleteObject {

    public List<GeometricFigure> geometricFigureList;

    public CompleteObject() {
        geometricFigureList = new ArrayList<>();
    }
    public void addGeometricFigure(String code){
        geometricFigureList.add(GeometricFigureFactory.getInstance().generateGeometricFigure(code));
    }
    public Double calculateTotalArea(){
        Double totalArea = 0.0;
        for (GeometricFigure geometricFigure : geometricFigureList) {
            totalArea += geometricFigure.calculateArea();
        }
        return totalArea;
    }
}
