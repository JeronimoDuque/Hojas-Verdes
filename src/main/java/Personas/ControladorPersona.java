package Personas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ControladorPersona {

    protected static final String filePathSecurity = "seguridad.csv";

    public static boolean autenticar(String inputID, String inputClave) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePathSecurity))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields[0].equals(inputID) && fields[1].equals(inputClave)) {
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

}
