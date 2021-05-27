package ejerciciosTP.punto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Reporte implements ReporteInterface{

    private String reporte;

    public Reporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        try {
            Writer writer = new FileWriter(file, true);
            writer.write(reporte);
            writer.close();
        }catch (IOException e){
            throw new RuntimeException("error", e);
        }

    }
}
