package ejerciciosTP.punto3;

public class Combo implements AdicionalDecorator{

    private String descripcion;
    private double precio;

    public Combo (String descripcion, double precio){
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public double monto() {
        return precio;
    }
}
