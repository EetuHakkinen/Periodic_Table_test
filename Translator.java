import javax.json.*;
import java.io.*;

public class Translator{
    private String language;
    private JsonObject object;

    public Translator(String language){
        try {
            this.language = language;
            FileReader read = new FileReader("./Translator.json");
            JsonReader jsonReader = Json.createReader(read);
            JsonObject object = jsonReader.readObject();
            jsonReader.close();
            this.object = object;
        } catch (Exception e){
            System.out.println("Virhe: " + e.getMessage());
        }
    }
    public String translate(String ilmaus){
        if (this.language.equals("fi")){
            String hello = object.getString(ilmaus);
            return hello;
        } else {
            return ilmaus;
        }
    }
}
