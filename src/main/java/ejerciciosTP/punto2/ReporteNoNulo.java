package ejerciciosTP.punto2;

import java.io.File;

public class ReporteNoNulo implements ReporteInterface{

    private ReporteInterface reporteInterface;

    public ReporteNoNulo(ReporteInterface reporteInterface){
        this.reporteInterface = reporteInterface;
    }

    @Override
    public void exportar(File file) {

        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        reporteInterface.exportar(file);
    }
}
