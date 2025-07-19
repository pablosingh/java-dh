import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Animal {

    //CREAR UNA APLICACIÓN QUE TENGA ACCESO A UNA TABLA ANIMALES
    //LOS ANIMALES DEBEN TENER NOMBRE Y TIPO
    //OBLIGATORIA -> ID

    //GENERAR ALGUNAS CONSTANTES
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS ANIMALES; CREATE " +
            "TABLE ANIMALES (ID INT PRIMARY KEY, " +
            " NOMBRE VARCHAR(100) NOT NULL," +
            " TIPO VARCHAR(100) NOT NULL)";

    private static final String SQL_INSERT = "INSERT INTO ANIMALES VALUES (1, 'Molly', 'gato')," +
            "(2, 'Helga', 'perro'), (3, 'Melba', 'perro'), (4, 'Rocky', 'tortuga')";

    private static final String SQL_SELECT = "SELECT * FROM ANIMALES";

    private static final String SQL_DELETE = "DELETE FROM ANIMALES WHERE ID = 3";

    private static final Logger LOGGER = Logger.getLogger(Animal.class);


    public static void main(String[] args) {

        Connection connection = null;

        try {

            //CONECTARNOS CON LA BD
            connection = getConnection();

            //ORDENES A LA BD
            Statement statement = connection.createStatement();

            //CREAR LA TABLA
            statement.execute(SQL_DROP_CREATE);

            //INSERTAR VALORES
            statement.execute(SQL_INSERT);

            //CONSULTA A LA BD
            ResultSet rs = statement.executeQuery(SQL_SELECT);


            //IMPRIMIR POR CONSOLA
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(2) + " - " +
                        "Tipo: " + rs.getString(3));
                LOGGER.info("Nombre: " + rs.getString(2) + " - " +
                        "Tipo: " + rs.getString(3));
            }

            //ORDENARLA A LA BD QUE BORRE UN VALOR
            statement.execute(SQL_DELETE);
            LOGGER.warn("ADVERTENCIA: Se borró un animal de la tabla con el id = 3");

            //GUARDAR EN JAVA LA NUEVA CONSULTA
            rs = statement.executeQuery(SQL_SELECT);

            System.out.println("-----------------------------");

            //IMPRIMIR LA CONSULTA
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(2) + " - " +
                        "Tipo: " + rs.getString(3));
                LOGGER.info("Nombre: " + rs.getString(2) + " - " +
                        "Tipo: " + rs.getString(3));
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //CERRAR LA CONEXIÓN A LA BD
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:∼/AccesoBD", "sa", "sa");
    }


}
