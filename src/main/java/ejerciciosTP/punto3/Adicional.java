package ejerciciosTP.punto3;

public class Adicional implements AdicionalDecorator{

    private String descripcion;
    private double precio;
    public AdicionalDecorator adicionalDecorator;

    public Adicional(String descripcion, double precio, AdicionalDecorator adicionalDecorator){
        this.descripcion = descripcion;
        this.precio = precio;
        this.adicionalDecorator = adicionalDecorator;
    }

    public String descripcion(){
        return adicionalDecorator.descripcion() + ", " + descripcion;
    }
    public double monto(){
        return adicionalDecorator.monto() + precio;
    }

}
