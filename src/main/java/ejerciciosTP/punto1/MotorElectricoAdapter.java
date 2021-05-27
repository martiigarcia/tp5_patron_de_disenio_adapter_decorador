package ejerciciosTP.punto1;

public class MotorElectricoAdapter extends Motor{

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        motorElectrico = new MotorElectrico();
    }

    @Override
    public void arrancar() {

        motorElectrico.conectar();
        motorElectrico.activar();

    }

    @Override
    public void acelerar() {

        motorElectrico.moverMasRapido();

    }

    @Override
    public void apagar() {

        motorElectrico.detener();
        motorElectrico.desconectar();

    }
}
