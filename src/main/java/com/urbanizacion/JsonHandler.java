package com.urbanizacion;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class JsonHandler {
    private static final String filePath = "ruta/a/tu/archivo.json";

    public static boolean borrarPorID(String id) {
        ObjectMapper objectMapper = new ObjectMapper();
        boolean found = false;

        try {
            // Leer el archivo JSON y cargarlo en una lista de objetos
            List<Perro> perros = objectMapper.readValue(new File(filePath), new TypeReference<List<Perro>>() {});

            // Usamos un iterador para eliminar el perro con el `id` especificado
            Iterator<Perro> iterator = perros.iterator();
            while (iterator.hasNext()) {
                Perro perro = iterator.next();
                if (perro.getId().equals(id)) {
                    iterator.remove();
                    found = true;
                    break; // Se sale del ciclo una vez que se elimina
                }
            }

            // Si se encontró y eliminó el objeto, escribimos la nueva lista en el archivo
            if (found) {
                objectMapper.writeValue(new File(filePath), perros);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return found;
    }
}

// Clase Perro que mapea el JSON
class Perro {
    private String id;
    private String nombre;
    private String raza;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}