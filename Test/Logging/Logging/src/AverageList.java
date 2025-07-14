import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AverageList {

    private static final Logger logger = Logger.getLogger(AverageList.class);
    private List<Integer> integerList = new ArrayList<>();

    public AverageList(List<Integer> integers) throws Exception {
        this.integerList = integers;

        if (integers.size() > 5) {
            logger.info("La longitud de la lista es mayor a 5 y el promedio es: " + average() );
        }
        if (integers.size() > 10) {
            logger.info("La longitud de la lista es mayor a 10 y el promedio es: " + average());
        }
        if (integers.size() == 0) {
            throw new Exception();
        }
    }

    public int average() {
        int addition = 0;
        for (Integer integer: integerList) {
            addition = addition + integer;
        }
        int result = addition / integerList.size();
        return result;
    }
}
