package ejerciciosTP.punto4.persistencia;

import ejerciciosTP.punto4.modelo.GsonParseadorInterface;
import ejerciciosTP.punto4.modelo.GuardarDecorador;
import ejerciciosTP.punto4.modelo.Posteo;
import ejerciciosTP.punto4.modelo.RestCallInterface;

import java.util.List;

public class Guardar implements GuardarDecorador {

    private RestCallInterface restCallInterface;
    private GsonParseadorInterface gsonParseadorInterface;

    public Guardar(RestCallInterface restCallInterface, GsonParseadorInterface gsonParseadorInterface) {
        this.restCallInterface = restCallInterface;
        this.gsonParseadorInterface = gsonParseadorInterface;
    }

    @Override
    public List<Posteo> recuperarPosteos() {
        return gsonParseadorInterface.parsear(restCallInterface.run());
    }
}
