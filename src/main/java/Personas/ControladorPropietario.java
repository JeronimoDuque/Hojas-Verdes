package Personas;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ControladorPropietario extends ControladorPersona{

    private static final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    protected static final String filePathOwners = "propietarios.json";

    public static boolean borrarPorID(String id) {
        ObjectMapper objectMapper = new ObjectMapper();
        boolean found = false;

        try {
            List<Propietario> propietarios = objectMapper.readValue(new File(filePathOwners), new TypeReference<List<Propietario>>() {});

            Iterator<Propietario> iterator = propietarios.iterator();
            while (iterator.hasNext()) {
                Propietario perro = iterator.next();
                if (perro.getId().equals(id)) {
                    iterator.remove();
                    found = true;
                    break; 
                }
            }

            if (found) {
                objectMapper.writeValue(new File(filePathOwners), propietarios);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return found;
    }

    public static void GuardarPropietario(Propietario propietario) throws IOException {
        // Leer los datos existentes
        List<Propietario> objects = mapper.readValue(new File(filePathOwners), new TypeReference<List<Propietario>>() {});

        // Agregar el nuevo objeto a la lista
        objects.add(propietario);

        // Guardar la lista actualizada en el archivo JSON
        mapper.writeValue(new File(filePathOwners), objects);
    }
}
