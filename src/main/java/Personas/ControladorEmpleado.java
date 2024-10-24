package Personas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ControladorEmpleado extends ControladorPersona{

    protected static final String filePathEmployees = "empleados.csv";

    public static boolean isEmployees(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathEmployees))) {
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
