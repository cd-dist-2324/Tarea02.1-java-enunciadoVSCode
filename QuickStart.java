
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import modelo.Persona;

/**
 * QuickStart
 */
public class QuickStart {

    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
        Persona persona = new Persona("Ana", 22);
        System.out.println("Nombre: " + persona.getNombre() + " edad: " + persona.getEdad());
        convertObjectToJSON(persona);
    }

    private static void convertObjectToJSON(Persona persona) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Creamos un fichero persona.json en la ruta relativa a la carpeta del proyecto con los datos de persona
            mapper.writeValue(new File("persona.json"), persona);

            // Creamos un string con formato JSON con los datos del objeto persona
            String jsonString = mapper.writeValueAsString(persona);
            //Mostramos el string en la consola de salida
            System.out.println(jsonString);

            //Creamos un string con formato JSON - pretty-print (indentado) con los datos del objeto persona 
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(persona);
            //Mostramos el string pretty-print (indentado) en la consola de salida
            System.out.println(jsonInString2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
