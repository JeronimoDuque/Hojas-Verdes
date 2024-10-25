package Personas;
import java.util.Objects;

public class Empleado extends Persona{
    private String cargo;
    private String fechaInicio;
    private String calidad;
    

    public Empleado() {
    }

    public Empleado(String nombre, String id, String contrasenna, String cargo, String fechaInicio, String calidad) {
        super(nombre,id,contrasenna);
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.calidad = calidad;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCalidad() {
        return this.calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Empleado cargo(String cargo) {
        setCargo(cargo);
        return this;
    }

    public Empleado fechaInicio(String fechaInicio) {
        setFechaInicio(fechaInicio);
        return this;
    }

    public Empleado calidad(String calidad) {
        setCalidad(calidad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(cargo, empleado.cargo) && Objects.equals(fechaInicio, empleado.fechaInicio) && Objects.equals(calidad, empleado.calidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo, fechaInicio, calidad);
    }

    @Override
    public String toString() {
        return "{" +
            " cargo='" + getCargo() + "'" +
            ", fechaInicio='" + getFechaInicio() + "'" +
            ", calidad='" + getCalidad() + "'" +
            "}";
    }
    

    public String toCSV(){
        return getId() + ";" + getNombre() + ";" + getContrasenna() + ";" + getCargo() + ";" + getFechaInicio() + ";" + getCalidad() ;
    }
}
