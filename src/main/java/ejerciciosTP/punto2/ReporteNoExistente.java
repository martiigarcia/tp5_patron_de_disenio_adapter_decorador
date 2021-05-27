package ejerciciosTP.punto2;

import java.io.File;

public class ReporteNoExistente implements ReporteInterface{

    private ReporteInterface reporteInterface;

    public ReporteNoExistente(ReporteInterface reporteInterface){
        this.reporteInterface = reporteInterface;
    }

    @Override
    public void exportar(File file) {

        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        reporteInterface.exportar(file);
    }
}
