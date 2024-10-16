package recursosTecnologicos;

public class RecursoTecnologico {

    private final String recursoID;
    private String nombre, descripcion;
    private static int cantidad;

    public RecursoTecnologico() {
        this.recursoID = "REC" + cantidad;
        this.nombre = "No Asignado";
        this.descripcion = "No Asignado";
        cantidad++;
    }

    public RecursoTecnologico(String nombre, String descripcion) {
        this.recursoID = "REC" + cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        cantidad++;
    }

    public String getRecursoID() {
        return recursoID;
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

    public static int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "RecursoTecnologico{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
