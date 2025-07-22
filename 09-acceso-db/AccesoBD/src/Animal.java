import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Animal {

    //CREAR UNA APLICACIÓN QUE TENGA ACCESO A UNA TABLA ANIMALES
    //LOS ANIMALES DEBEN TENER NOMBRE Y TIPO
    //OBLIGATORIA -> ID

    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS ANIMALES; CREATE " +
            "TABLE ANIMALES (ID INT PRIMARY KEY, " +
            " NOMBRE VARCHAR(100) NOT NULL," +
            " TIPO VARCHAR(100) NOT NULL)";

    private static final String SQL_INSERT = "INSERT INTO ANIMALES VALUES (1, 'Molly', 'gato')," +
            "(2, 'Helga', 'perro'), (3, 'Melba', 'perro'), (4, 'Rocky', 'tortuga')";

    private static final String SQL_SELECT = "SELECT * FROM ANIMALES";

    private static final String SQL_DELETE = "DELETE FROM ANIMALES WHERE ID = 3";

    private static final Logger logger = LogManager.getLogger(Animal.class);

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Class.forName("org.h2.Driver"));

        Connection connection = null;

        try {
            System.out.println("Conectando a la BD...");
            connection = getConnection();
            connection.setAutoCommit(true);
            System.out.println("Conexión establecida.");

            Statement statement = connection.createStatement();

            // CREAR LA TABLA
            statement.execute(SQL_DROP_CREATE);

            // INSERTAR VALORES
            statement.execute(SQL_INSERT);

            // CONSULTA A LA BD
            ResultSet rs = statement.executeQuery(SQL_SELECT);

            // IMPRIMIR POR CONSOLA
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(2) + " - Tipo: " + rs.getString(3));
                logger.info("Nombre: " + rs.getString(2) + " - " +
                        "Tipo: " + rs.getString(3));
            }

            // BORRAR UN VALOR
            statement.execute(SQL_DELETE);
            System.out.println("ADVERTENCIA: Se borró un animal de la tabla con el id = 3");
            logger.warn("ADVERTENCIA: Se borró un animal de la tabla con el id = 3");
            // NUEVA CONSULTA
            rs = statement.executeQuery(SQL_SELECT);

            System.out.println("-----------------------------");

            // IMPRIMIR LA CONSULTA
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(2) + " - Tipo: " + rs.getString(3));
                logger.info("Nombre: " + rs.getString(2) + " - " +
                        "Tipo: " + rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws Exception {
        String url = "jdbc:h2:file:D:/Codigo/java-dh/09-acceso-db/AccesoBD/Animales;TRACE_LEVEL_FILE=4";
        System.out.println(url);

        Class.forName("org.h2.Driver");
        return DriverManager.getConnection(url, "sa", "sa");
    }
}
