package ejerciciosTP.punto3;

public class Main {

    public static void main(String[] args) {

        AdicionalDecorator adicionalDecorator = new Adicional(
                "carne", 20,
                new Adicional("queso", 5,
                    new Combo("FAMILIAR", 15)));

        System.out.println("Descripcion del combo: "+adicionalDecorator.descripcion());
        System.out.println("Precio del combo: "+adicionalDecorator.monto());
    }

}
