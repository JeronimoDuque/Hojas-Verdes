package Personas;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControladorPropietario extends ControladorPersona{

    protected static final String filePathOwners = "propietarios.json";

    public static boolean borrarPorID(String id) {
        ObjectMapper objectMapper = new ObjectMapper();
        boolean found = false;

        try {
            // Leer el archivo JSON y cargarlo en una lista de objetos
            List<Propietario> propietarios = objectMapper.readValue(new File(filePathOwners), new TypeReference<List<Propietario>>() {});

            // Usamos un iterador para eliminar el perro con el `id` especificado
            Iterator<Propietario> iterator = propietarios.iterator();
            while (iterator.hasNext()) {
                Propietario perro = iterator.next();
                if (perro.getId().equals(id)) {
                    iterator.remove();
                    found = true;
                    break; // Se sale del ciclo una vez que se elimina
                }
            }

            // Si se encontró y eliminó el objeto, escribimos la nueva lista en el archivo
            if (found) {
                objectMapper.writeValue(new File(filePathOwners), propietarios);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return found;
    }
}
