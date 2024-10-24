package Propiedades;
import java.util.Objects;

public class EspacioComun {
    private String descripcion;
    private String horaInicio;
    private String horaCierre;
    private String periorisidadServicio;
    private float mantenimiento;
    private int capacidadMaxima;
    private String diasServicio;

    public EspacioComun() {
    }

    public EspacioComun(String descripcion, String horaInicio, String horaCierre, String periorisidadServicio, float mantenimiento, int capacidadMaxima, String diasServicio) {
        this.descripcion = descripcion;
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.periorisidadServicio = periorisidadServicio;
        this.mantenimiento = mantenimiento;
        this.capacidadMaxima = capacidadMaxima;
        this.diasServicio = diasServicio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraCierre() {
        return this.horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getPeriorisidadServicio() {
        return this.periorisidadServicio;
    }

    public void setPeriorisidadServicio(String periorisidadServicio) {
        this.periorisidadServicio = periorisidadServicio;
    }

    public float getMantenimiento() {
        return this.mantenimiento;
    }

    public void setMantenimiento(float mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getDiasServicio() {
        return this.diasServicio;
    }

    public void setDiasServicio(String diasServicio) {
        this.diasServicio = diasServicio;
    }

    public EspacioComun descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    public EspacioComun horaInicio(String horaInicio) {
        setHoraInicio(horaInicio);
        return this;
    }

    public EspacioComun horaCierre(String horaCierre) {
        setHoraCierre(horaCierre);
        return this;
    }

    public EspacioComun periorisidadServicio(String periorisidadServicio) {
        setPeriorisidadServicio(periorisidadServicio);
        return this;
    }

    public EspacioComun mantenimiento(float mantenimiento) {
        setMantenimiento(mantenimiento);
        return this;
    }

    public EspacioComun capacidadMaxima(int capacidadMaxima) {
        setCapacidadMaxima(capacidadMaxima);
        return this;
    }

    public EspacioComun diasServicio(String diasServicio) {
        setDiasServicio(diasServicio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EspacioComun)) {
            return false;
        }
        EspacioComun espacioComun = (EspacioComun) o;
        return Objects.equals(descripcion, espacioComun.descripcion) && Objects.equals(horaInicio, espacioComun.horaInicio) && Objects.equals(horaCierre, espacioComun.horaCierre) && Objects.equals(periorisidadServicio, espacioComun.periorisidadServicio) && mantenimiento == espacioComun.mantenimiento && capacidadMaxima == espacioComun.capacidadMaxima && Objects.equals(diasServicio, espacioComun.diasServicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, horaInicio, horaCierre, periorisidadServicio, mantenimiento, capacidadMaxima, diasServicio);
    }

    @Override
    public String toString() {
        return "{" +
            " descripcion='" + getDescripcion() + "'" +
            ", horaInicio='" + getHoraInicio() + "'" +
            ", horaCierre='" + getHoraCierre() + "'" +
            ", periorisidadServicio='" + getPeriorisidadServicio() + "'" +
            ", mantenimiento='" + getMantenimiento() + "'" +
            ", capacidadMaxima='" + getCapacidadMaxima() + "'" +
            ", diasServicio='" + getDiasServicio() + "'" +
            "}";
    }
    
}
