package proyectos;

import fecha.Fecha;

public class DesarrolloDeHardware extends ProyectoTecnologico {
    private String tipoDispositivo;
    private static int cantidadProyHardware = 0;

    public DesarrolloDeHardware() {
        super();
        cantidadProyHardware++;
    }

    public DesarrolloDeHardware(String tipoDispositivo, String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.tipoDispositivo = tipoDispositivo;
        cantidadProyHardware++;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public static int getCantidadProyHardware() {
        return cantidadProyHardware;
    }

    @Override
    public String toString() {
        return "DesarrolloDeHardware{" + super.toString() + ", tipoDispositivo=" + tipoDispositivo + '}';
    }
    
    /* Abajo metodos adicionales */
}
