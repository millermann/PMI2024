package recursosTecnologicos;

public class RecursoTecnologico {
    private String nombre, descripcion;

    public RecursoTecnologico() {
        this.nombre = " ";
        this.descripcion = " ";
    }

    public RecursoTecnologico(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "RecursoTecnologico{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
}
