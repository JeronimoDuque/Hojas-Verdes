package Propiedades;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Personas.Persona;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Propiedades.Casa;


public class ControladorCasa extends ControladorPropiedad{

    private static final String filePathPropiedades = "propiedades.json";

    public static void agregarPersonaAJson(Casa casa) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Casa> casas = new ArrayList<>();

        // Leer datos existentes del archivo JSON
        try {
            // Verificar si el archivo ya existe
            File file = new File(filePathPropiedades);
            if (file.exists()) {
                // Leer el contenido existente
                casas = objectMapper.readValue(file, new TypeReference<List<Casa>>() {});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Agregar la nueva persona a la lista
        casas.add(casa);

        // Escribir la lista actualizada de nuevo en el archivo JSON
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePathPropiedades), casas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

