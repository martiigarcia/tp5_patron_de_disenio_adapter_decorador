package ejerciciosTP.punto4;

import ejerciciosTP.punto4.modelo.Blog;
import ejerciciosTP.punto4.persistencia.Guardar;
import ejerciciosTP.punto4.persistencia.GuardarBaseDeDatos;
import ejerciciosTP.punto4.persistencia.GuardarEnArchivo;
import ejerciciosTP.punto4.servicios.GsonParseador;
import ejerciciosTP.punto4.servicios.RestCall;

public class Main {

    public static void main(String[] args) {
        /*RestCall rest = new RestCall(
                "https://jsonplaceholder.typicode.com/posts");
        System.out.println(rest.run());*/

        Blog opcionBlog1 = new Blog(
                new GuardarEnArchivo("archivo_punto_cuatro.txt",
                        new Guardar(new RestCall("https://jsonplaceholder.typicode.com/posts"),
                        new GsonParseador())
                )
        );
        opcionBlog1.recuperarPosteosDelServicioWeb();

        Blog opcionBlog2 = new Blog(new GuardarBaseDeDatos(
                new GuardarEnArchivo("archivo_punto_cuatro.txt",
                        new Guardar(new RestCall("https://jsonplaceholder.typicode.com/posts"),
                                new GsonParseador())))
        );
        opcionBlog2.recuperarPosteosDelServicioWeb();

        Blog opcionBlog3 = new Blog(
                new GuardarBaseDeDatos(
                        new Guardar(new RestCall("https://jsonplaceholder.typicode.com/posts"),
                                new GsonParseador()))
        );
        opcionBlog3.recuperarPosteosDelServicioWeb();

        Blog opcionBlog4 = new Blog(new GuardarEnArchivo("archivo_punto_cuatro.txt",
                        new GuardarBaseDeDatos(
                                new Guardar(new RestCall("https://jsonplaceholder.typicode.com/posts"),
                                        new GsonParseador())))
        );
        opcionBlog4.recuperarPosteosDelServicioWeb();



    }

}