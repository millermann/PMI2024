package estructuraBase;

import java.time.LocalDate; 

public abstract class Proyecto { // abstracta ?
    private String titulo;
    private String descripcion;
    private float presupuesto;
    private Fecha fecInicio;
    private Fecha fecFin;
    private LocalDate inicio; // usar esta?

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * @return the presupuesto
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * @return the fecInicio
     */
    public Fecha getFecInicio() {
        return fecInicio;
    }

    /**
     * @param fecInicio the fecInicio to set
     */
    public void setFecInicio(Fecha fecInicio) {
        this.fecInicio = fecInicio;
    }

    /**
     * @return the fecFin
     */
    public Fecha getFecFin() {
        return fecFin;
    }

    /**
     * @param fecFin the fecFin to set
     */
    public void setFecFin(Fecha fecFin) {
        this.fecFin = fecFin;
    }

    /**
     * @return the inicio
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    
}
