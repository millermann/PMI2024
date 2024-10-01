package proyectos;

import fecha.Fecha;

public abstract class ProyectoTecnologico {
    private String titulo, descripcion;
    private float presupuesto;
    private Fecha fechaInicio, fechaFin;
    private static int cantidad = 0;

    public ProyectoTecnologico() {
        cantidad++;
    }

    public ProyectoTecnologico(String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        cantidad++;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public static int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", descripcion=" + descripcion + ", presupuesto=" + presupuesto + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    /* Abajo metodos adicionales */
    
}
