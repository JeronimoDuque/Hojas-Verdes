package Documentos;

import java.util.ArrayList;
import java.util.Objects;

import Personas.Propietario;

public class Factura {
    private Propietario propietario;
    private String idFactura;
    private String fechaFactura;
    private float valorMetroCuadrado;
    private float valorPagado;
    private ArrayList<Multa> multas;


    public Factura() {
    }

    public Factura(Propietario propietario, String idFactura, String fechaFactura, float valorMetroCuadrado, float valorPagado, ArrayList<Multa> multas) {
        this.propietario = propietario;
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.valorPagado = valorPagado;
        this.multas = multas;
    }

    public Propietario getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getIdFactura() {
        return this.idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getFechaFactura() {
        return this.fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public float getValorMetroCuadrado() {
        return this.valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(float valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public float getValorPagado() {
        return this.valorPagado;
    }

    public void setValorPagado(float valorPagado) {
        this.valorPagado = valorPagado;
    }

    public ArrayList<Multa> getMultas() {
        return this.multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }

    public Factura propietario(Propietario propietario) {
        setPropietario(propietario);
        return this;
    }

    public Factura idFactura(String idFactura) {
        setIdFactura(idFactura);
        return this;
    }

    public Factura fechaFactura(String fechaFactura) {
        setFechaFactura(fechaFactura);
        return this;
    }

    public Factura valorMetroCuadrado(float valorMetroCuadrado) {
        setValorMetroCuadrado(valorMetroCuadrado);
        return this;
    }

    public Factura valorPagado(float valorPagado) {
        setValorPagado(valorPagado);
        return this;
    }

    public Factura multas(ArrayList<Multa> multas) {
        setMultas(multas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Factura)) {
            return false;
        }
        Factura factura = (Factura) o;
        return Objects.equals(propietario, factura.propietario) && Objects.equals(idFactura, factura.idFactura) && Objects.equals(fechaFactura, factura.fechaFactura) && valorMetroCuadrado == factura.valorMetroCuadrado && valorPagado == factura.valorPagado && Objects.equals(multas, factura.multas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propietario, idFactura, fechaFactura, valorMetroCuadrado, valorPagado, multas);
    }

    @Override
    public String toString() {
        return "{" +
            " propietario='" + getPropietario() + "'" +
            ", idFactura='" + getIdFactura() + "'" +
            ", fechaFactura='" + getFechaFactura() + "'" +
            ", valorMetroCuadrado='" + getValorMetroCuadrado() + "'" +
            ", valorPagado='" + getValorPagado() + "'" +
            ", multas='" + getMultas() + "'" +
            "}";
    }
    public String toCSV() {
        return getPropietario() + ";" + getIdFactura() + ";" + getFechaFactura() + ";" + getValorMetroCuadrado() + ";" + getValorPagado() + ";" + getMultas();
    }
}
/*
 *  private Propietario propietario;
    private String idFactura;
    private String fechaFactura;
    private float valorMetroCuadrado;
    private float valorPagado;
    private ArrayList<Multa> multas;
 */