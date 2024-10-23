package Controlador;
import java.util.Objects;

public class Persona {
    private String nombre;
    private String id;
    private String contrasenna;

    public Persona() {
    }

    public Persona(String nombre, String id, String contrasenna) {
        this.nombre = nombre;
        this.id = id;
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasenna() {
        return this.contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona id(String id) {
        setId(id);
        return this;
    }

    public Persona contrasenna(String contrasenna) {
        setContrasenna(contrasenna);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(id, persona.id) && Objects.equals(contrasenna, persona.contrasenna);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, contrasenna);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            ", contrasenna='" + getContrasenna() + "'" +
            "}";
    }
    
}
