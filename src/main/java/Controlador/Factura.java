package Controlador;
import java.util.Objects;

public class Factura {
    private String idFactura;
    private String fechaFactura;
    private float valorMetroCuadrado;
    private float valorPagado;


    public Factura() {
    }

    public Factura(String idFactura, String fechaFactura, float valorMetroCuadrado, float valorPagado) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.valorPagado = valorPagado;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Factura)) {
            return false;
        }
        Factura factura = (Factura) o;
        return Objects.equals(idFactura, factura.idFactura) && Objects.equals(fechaFactura, factura.fechaFactura) && valorMetroCuadrado == factura.valorMetroCuadrado && valorPagado == factura.valorPagado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, fechaFactura, valorMetroCuadrado, valorPagado);
    }

    @Override
    public String toString() {
        return "{" +
            " idFactura='" + getIdFactura() + "'" +
            ", fechaFactura='" + getFechaFactura() + "'" +
            ", valorMetroCuadrado='" + getValorMetroCuadrado() + "'" +
            ", valorPagado='" + getValorPagado() + "'" +
            "}";
    }
    
}
