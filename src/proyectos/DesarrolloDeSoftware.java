package proyectos;

import fecha.Fecha;

public class DesarrolloDeSoftware extends ProyectoTecnologico {
    private String tipoAplicacion;
    private static int cantidadProySoftware = 0;

    public DesarrolloDeSoftware() {
        super();
        cantidadProySoftware++;
    }

    public DesarrolloDeSoftware(String tipo, String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.tipoAplicacion = tipo;
        cantidadProySoftware++;
    }

    public String getTipoAplicacion() {
        return tipoAplicacion;
    }

    public void setTipoAplicacion(String tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }

    public static int getCantidadProySoftware() {
        return cantidadProySoftware;
    }
    
    @Override
    public String toString() {
        return "DesarrolloDeSoftware{" + super.toString() + ", tipo=" + tipoAplicacion + '}';
    }
    
}
