package ejerciciosTP.punto2;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        ReporteInterface reporteInterface = new ReporteNoNulo(
                new ReporteNoExistente(new Reporte("TEXTO")));
        reporteInterface.exportar(new File("archivo_punto_dos.txt"));
    }
}
