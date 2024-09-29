package proyectos;

import fecha.Fecha;

public class DesarrolloDeHardware extends ProyectoTecnologico {
    private String tipoDispositivo;
    private static int cantidadHardware = 0;

    public DesarrolloDeHardware() {
        super();
        cantidadHardware++;
    }

    public DesarrolloDeHardware(String tipoDispositivo, String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.tipoDispositivo = tipoDispositivo;
        cantidadHardware++;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public static int getCantidadHardware() {
        return cantidadHardware;
    }

    @Override
    public String toString() {
        return "DesarrolloDeHardware{" + super.toString() + ", tipoDispositivo=" + tipoDispositivo + '}';
    }
    
    
}
