package Propiedades;

import java.util.Objects;

import Personas.Propietario;

public class Casa extends Propiedad{
    private String id;
    private float costoAdministracion;
    private float saldoActual;
    private int metrosCuadrados;


    public Casa() {
    }

    public Casa(Propietario propietario, String id, float costoAdministracion, float saldoActual, int metrosCuadrados) {
        super(propietario);
        this.id = id;
        this.costoAdministracion = costoAdministracion;
        this.saldoActual = saldoActual;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCostoAdministracion() {
        return this.costoAdministracion;
    }

    public void setCostoAdministracion(float costoAdministracion) {
        this.costoAdministracion = costoAdministracion;
    }

    public float getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Casa id(String id) {
        setId(id);
        return this;
    }

    public Casa costoAdministracion(float costoAdministracion) {
        setCostoAdministracion(costoAdministracion);
        return this;
    }

    public Casa saldoActual(float saldoActual) {
        setSaldoActual(saldoActual);
        return this;
    }

    public Casa metrosCuadrados(int metrosCuadrados) {
        setMetrosCuadrados(metrosCuadrados);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Casa)) {
            return false;
        }
        Casa casa = (Casa) o;
        return Objects.equals(id, casa.id) && costoAdministracion == casa.costoAdministracion && saldoActual == casa.saldoActual && metrosCuadrados == casa.metrosCuadrados;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, costoAdministracion, saldoActual, metrosCuadrados);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", costoAdministracion='" + getCostoAdministracion() + "'" +
            ", saldoActual='" + getSaldoActual() + "'" +
            ", metrosCuadrados='" + getMetrosCuadrados() + "'" +
            "}";
    }
    
    
}
