package ejerciciosTP.punto1;

public class MotorComun extends Motor{

    @Override
    public void arrancar() {
        System.out.println("Encendiendo motor...");
        System.out.println("El motor arranco");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor...");
        System.out.println("El motor acelero");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor...");
        System.out.println("El motor fue apagado");
    }
}
