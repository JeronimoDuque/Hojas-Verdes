package Controlador;

import java.util.Objects;

public class Propiedad {
    private Propietario propietario;


    public Propiedad() {
    }

    public Propiedad(Propietario propietario) {
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Propiedad propietario(Propietario propietario) {
        setPropietario(propietario);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Propiedad)) {
            return false;
        }
        Propiedad propiedad = (Propiedad) o;
        return Objects.equals(propietario, propiedad.propietario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(propietario);
    }
/*
 * pregunatrle a la profesora por este error
 */
    @Override
    public String toString() {
        return "{" +
            " propietario='" + getPropietario() + "'" +
            "}";
    }

}
