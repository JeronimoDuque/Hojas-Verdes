package Personas;
import java.util.ArrayList;
import java.util.Objects;

import Propiedades.Propiedad;

public class Propietario extends Persona{
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String profesion;
    private ArrayList<Propiedad> propiedades;


    public Propietario() {
    }

    public Propietario(String direccion, String telefono, String correoElectronico, String profesion, ArrayList<Propiedad> propiedades) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.profesion = profesion;
        this.propiedades = propiedades;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return this.propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public Propietario direccion(String direccion) {
        setDireccion(direccion);
        return this;
    }

    public Propietario telefono(String telefono) {
        setTelefono(telefono);
        return this;
    }

    public Propietario correoElectronico(String correoElectronico) {
        setCorreoElectronico(correoElectronico);
        return this;
    }

    public Propietario profesion(String profesion) {
        setProfesion(profesion);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Propietario)) {
            return false;
        }
        Propietario propietario = (Propietario) o;
        return Objects.equals(direccion, propietario.direccion) && Objects.equals(telefono, propietario.telefono) && Objects.equals(correoElectronico, propietario.correoElectronico) && Objects.equals(profesion, propietario.profesion) && Objects.equals(propiedades, propietario.propiedades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, telefono, correoElectronico, profesion, propiedades);
    }

    @Override
    public String toString() {
        return "{" +
            " direccion='" + getDireccion() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            ", profesion='" + getProfesion() + "'" +
            ", propiedades='" + getPropiedades() + "'" +
            "}";
    }

} 