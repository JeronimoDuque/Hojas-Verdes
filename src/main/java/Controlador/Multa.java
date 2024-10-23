package Controlador;
import java.util.Objects;

public class Multa {
    private String idMulta;
    private String fechaMulta;
    private String fechaEvento;
    private EspacioComun espacioMulta;
    private Propiedad propiedadMulta;
    private String personaQueGenera;
    private Propietario PropietarioMulta;
    private String descripcion;
    private float valorMulta;
    private String fechaMaxima;
    private String notificacion;


    public Multa() {
    }

    public Multa(String idMulta, String fechaMulta, String fechaEvento, EspacioComun espacioMulta, Propiedad propiedadMulta, String personaQueGenera, Propietario PropietarioMulta, String descripcion, float valorMulta, String fechaMaxima, String notificacion) {
        this.idMulta = idMulta;
        this.fechaMulta = fechaMulta;
        this.fechaEvento = fechaEvento;
        this.espacioMulta = espacioMulta;
        this.propiedadMulta = propiedadMulta;
        this.personaQueGenera = personaQueGenera;
        this.PropietarioMulta = PropietarioMulta;
        this.descripcion = descripcion;
        this.valorMulta = valorMulta;
        this.fechaMaxima = fechaMaxima;
        this.notificacion = notificacion;
    }

    public String getIdMulta() {
        return this.idMulta;
    }

    public void setIdMulta(String idMulta) {
        this.idMulta = idMulta;
    }

    public String getFechaMulta() {
        return this.fechaMulta;
    }

    public void setFechaMulta(String fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public String getFechaEvento() {
        return this.fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public EspacioComun getEspacioMulta() {
        return this.espacioMulta;
    }

    public void setEspacioMulta(EspacioComun espacioMulta) {
        this.espacioMulta = espacioMulta;
    }

    public Propiedad getPropiedadMulta() {
        return this.propiedadMulta;
    }

    public void setPropiedadMulta(Propiedad propiedadMulta) {
        this.propiedadMulta = propiedadMulta;
    }

    public String getPersonaQueGenera() {
        return this.personaQueGenera;
    }

    public void setPersonaQueGenera(String personaQueGenera) {
        this.personaQueGenera = personaQueGenera;
    }

    public Propietario getPropietarioMulta() {
        return this.PropietarioMulta;
    }

    public void setPropietarioMulta(Propietario PropietarioMulta) {
        this.PropietarioMulta = PropietarioMulta;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValorMulta() {
        return this.valorMulta;
    }

    public void setValorMulta(float valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getFechaMaxima() {
        return this.fechaMaxima;
    }

    public void setFechaMaxima(String fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

    public String getNotificacion() {
        return this.notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public Multa idMulta(String idMulta) {
        setIdMulta(idMulta);
        return this;
    }

    public Multa fechaMulta(String fechaMulta) {
        setFechaMulta(fechaMulta);
        return this;
    }

    public Multa fechaEvento(String fechaEvento) {
        setFechaEvento(fechaEvento);
        return this;
    }

    public Multa espacioMulta(EspacioComun espacioMulta) {
        setEspacioMulta(espacioMulta);
        return this;
    }

    public Multa propiedadMulta(Propiedad propiedadMulta) {
        setPropiedadMulta(propiedadMulta);
        return this;
    }

    public Multa personaQueGenera(String personaQueGenera) {
        setPersonaQueGenera(personaQueGenera);
        return this;
    }

    public Multa PropietarioMulta(Propietario PropietarioMulta) {
        setPropietarioMulta(PropietarioMulta);
        return this;
    }

    public Multa descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    public Multa valorMulta(float valorMulta) {
        setValorMulta(valorMulta);
        return this;
    }

    public Multa fechaMaxima(String fechaMaxima) {
        setFechaMaxima(fechaMaxima);
        return this;
    }

    public Multa notificacion(String notificacion) {
        setNotificacion(notificacion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Multa)) {
            return false;
        }
        Multa multa = (Multa) o;
        return Objects.equals(idMulta, multa.idMulta) && Objects.equals(fechaMulta, multa.fechaMulta) && Objects.equals(fechaEvento, multa.fechaEvento) && Objects.equals(espacioMulta, multa.espacioMulta) && Objects.equals(propiedadMulta, multa.propiedadMulta) && Objects.equals(personaQueGenera, multa.personaQueGenera) && Objects.equals(PropietarioMulta, multa.PropietarioMulta) && Objects.equals(descripcion, multa.descripcion) && valorMulta == multa.valorMulta && Objects.equals(fechaMaxima, multa.fechaMaxima) && Objects.equals(notificacion, multa.notificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMulta, fechaMulta, fechaEvento, espacioMulta, propiedadMulta, personaQueGenera, PropietarioMulta, descripcion, valorMulta, fechaMaxima, notificacion);
    }

    @Override
    public String toString() {
        return "{" +
            " idMulta='" + getIdMulta() + "'" +
            ", fechaMulta='" + getFechaMulta() + "'" +
            ", fechaEvento='" + getFechaEvento() + "'" +
            ", espacioMulta='" + getEspacioMulta() + "'" +
            ", propiedadMulta='" + getPropiedadMulta() + "'" +
            ", personaQueGenera='" + getPersonaQueGenera() + "'" +
            ", PropietarioMulta='" + getPropietarioMulta() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", valorMulta='" + getValorMulta() + "'" +
            ", fechaMaxima='" + getFechaMaxima() + "'" +
            ", notificacion='" + getNotificacion() + "'" +
            "}";
    }
    
}
