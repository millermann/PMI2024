package proyectos;

import fecha.Fecha;

public class DesarrolloDeSoftware extends ProyectoTecnologico {
    private String tipoAplicacion;
    private static int cantidadSoftware = 0;

    public DesarrolloDeSoftware() {
        super();
        cantidadSoftware++;
    }

    public DesarrolloDeSoftware(String tipo, String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.tipoAplicacion = tipo;
        cantidadSoftware++;
    }

    public String getTipoAplicacion() {
        return tipoAplicacion;
    }

    public void setTipoAplicacion(String tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }

    public static int getCantidadSoftware() {
        return cantidadSoftware;
    }
    
    @Override
    public String toString() {
        return "DesarrolloDeSoftware{" + super.toString() + ", tipo=" + tipoAplicacion + '}';
    }
    
}
