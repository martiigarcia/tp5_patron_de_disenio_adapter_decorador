package ejerciciosTP.punto4.modelo;

import java.util.List;

public class Blog {


    public GuardarDecorador guardarDecorador;

    public Blog( GuardarDecorador guardarDecorador){
        this.guardarDecorador = guardarDecorador;
    }

    public void recuperarPosteosDelServicioWeb(){
        guardarDecorador.recuperarPosteos();
    }


}
