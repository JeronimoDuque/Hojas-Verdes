package Personas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ControladorPersona {

    protected static final String filePathSecurity = "seguridad.csv";

    public static boolean autenticar(String id, String contrasenna) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathSecurity))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields[0].equals(id) && fields[1].equals(contrasenna)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static boolean isIDRegistered(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathSecurity))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields[0].equals(id)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static void CrearSeguridad(Persona persona) {
            try (FileWriter writer = new FileWriter(filePathSecurity,true)) {
                writer.write(persona.toSeguridad() + "\n"); // Escribe cada objeto como una fila de CSV
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo.");
            e.printStackTrace();
        }
    }

}
