package proyectos;

import fecha.Fecha;

public class DesarrolloDeSoftware extends ProyectoTecnologico {
    private String tipoAplicacion;
    private static int cantidadProySoftware = 0;

    public DesarrolloDeSoftware() {
        super();
        cantidadProySoftware++;
    }

    public DesarrolloDeSoftware(String titulo, String tipoAplicacion, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.tipoAplicacion = tipoAplicacion;
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
    
    @Override
    public String getTipo(){ //deberia reemplazar a getTipoAplicacion???
        return tipoAplicacion;
    }
    
    @Override
    public String getWare(){
        return "Software";
    }
    
    /* Abajo metodos adicionales */
    
    public static void disminuirCantidadProyectosSoftware(){
        cantidadProySoftware--;
    }
}
