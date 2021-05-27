package ejerciciosTP.punto4.modelo;

import java.util.List;

public interface GsonParseadorInterface {

    List<Posteo> parsear(String json);

}
