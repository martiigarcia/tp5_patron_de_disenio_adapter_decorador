package ejerciciosTP.punto4.servicios;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ejerciciosTP.punto4.modelo.GsonParseadorInterface;
import ejerciciosTP.punto4.modelo.Posteo;

import java.util.List;

public class GsonParseador implements GsonParseadorInterface {

    public List<Posteo> parsear(String json) {
        return new Gson().fromJson(json, new TypeToken<List<Posteo>>() {
        }.getType());
    }

    //OTRA FORMA DE HACERLO:

    /*
    public List<Posteo> parsear(String json) {
        List<Posteo> listaPosteos = new ArrayList<>();

        JsonArray listaElementos = JsonParser.parseString(json).getAsJsonArray();

        for (JsonElement elementoJson : listaElementos) {
            JsonObject objectoJson = elementoJson.getAsJsonObject();
            listaPosteos.add(
                    new Posteo(
                            objectJson.get("id").getAsInt(),
                            objectJson.get("title").getAsString(),
                            objectJson.get("body").getAsString(),
                            objectJson.get("userId").getAsInt()
                    )
            );
        }

        return listaPosteos;
       }

    */

}
