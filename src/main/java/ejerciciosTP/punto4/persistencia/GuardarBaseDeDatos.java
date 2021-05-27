package ejerciciosTP.punto4.persistencia;

import ejerciciosTP.punto4.modelo.GuardarDecorador;
import ejerciciosTP.punto4.modelo.Posteo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class GuardarBaseDeDatos implements GuardarDecorador {

    private GuardarDecorador guardarDecorador;

    public GuardarBaseDeDatos(GuardarDecorador guardarDecorador) {
        this.guardarDecorador = guardarDecorador;
    }


    @Override
    public List<Posteo> recuperarPosteos() {

        JDBCConexion conexion = new JDBCConexion();
        List<Posteo> listaPosteos = guardarDecorador.recuperarPosteos();

        try {
            Connection connection = conexion.conexion();
            PreparedStatement consulta =
                    connection.prepareStatement(
                            "INSERT INTO registro_posteos " +
                                    "(user_id, id, title, body) " +
                                    "VALUES (?, ?, ?, ?)");

            for(Posteo posteo : listaPosteos) {
                consulta.setInt(1, posteo.getUserId());
                consulta.setInt(2, posteo.getId());
                consulta.setString(3, posteo.getTitle());
                consulta.setString(4, posteo.getBody());
                consulta.executeUpdate();
                consulta.clearParameters();
            }

            consulta.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException("No se pudo registrar el posteo.", e);
        }
        return listaPosteos;
    }
}
