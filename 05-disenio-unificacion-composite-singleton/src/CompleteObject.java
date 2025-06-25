import java.util.ArrayList;
import java.util.List;

public class CompleteObject {

    public List<GeometricFigure> geometricFigureList;

    public CompleteObject() {
        geometricFigureList = new ArrayList<>();
    }
    public void addGeometricFigure(String code){
        try {
            GeometricFigure geometricFigure = GeometricFigureFactory.getInstance().generateGeometricFigure(code);
            geometricFigureList.add(geometricFigure);
        }catch (GeometricFigureFactoryException e){
            System.out.println(e.getMessage());
        }
    }
    public Double calculateTotalArea(){
        Double totalArea = 0.0;
        for (GeometricFigure geometricFigure : geometricFigureList) {
            totalArea += geometricFigure.calculateArea();
        }
        return totalArea;
    }
}
