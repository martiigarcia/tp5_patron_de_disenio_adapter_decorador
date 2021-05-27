package ejerciciosTP.punto4.persistencia;

import ejerciciosTP.punto4.modelo.GuardarDecorador;
import ejerciciosTP.punto4.modelo.Posteo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class GuardarEnArchivo implements GuardarDecorador {

    private final File file;
    private GuardarDecorador guardarDecorador;

    public GuardarEnArchivo(String path, GuardarDecorador guardarDecorador) {
        this.file = new File(path);
        this.guardarDecorador = guardarDecorador;
    }

    @Override
    public List<Posteo> recuperarPosteos() {
        List<Posteo> listaPosteos = guardarDecorador.recuperarPosteos();
        try {

            Writer writer = new FileWriter(file, true);
            for(Posteo posteo : listaPosteos) {
                writer.write(posteo.getUserId() + "-- "
                        + posteo.getId() + "-- "
                        + posteo.getTitle() + "-- "
                        + posteo.getBody() + "\n");
            }

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException("No se pudo registrar el posteo.", e);
        }
        return listaPosteos;
    }
}
