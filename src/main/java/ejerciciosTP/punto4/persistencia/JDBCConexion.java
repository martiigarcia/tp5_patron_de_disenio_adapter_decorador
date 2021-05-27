package ejerciciosTP.punto4.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConexion {

    public Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/tp_garcia";

        return DriverManager.getConnection(url, "root", "");
    }

}