import ejerciciosTP.punto2.Reporte;
import ejerciciosTP.punto2.ReporteInterface;
import ejerciciosTP.punto2.ReporteNoExistente;
import ejerciciosTP.punto2.ReporteNoNulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class ReporteTest {

    private ReporteInterface reporteInterface;

    @Test
    public void verificar() throws FileNotFoundException {

        reporteInterface = new ReporteNoNulo(
                new ReporteNoExistente(new Reporte("TEXTO")));
        reporteInterface.exportar(new File("archivo_punto_dos.txt"));

        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo_punto_dos.txt"));
            assertEquals("TEXTO", reader.readLine());
        }catch (IOException e) {

        }
    }

}
