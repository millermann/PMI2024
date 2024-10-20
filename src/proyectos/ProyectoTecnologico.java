package proyectos;

import fecha.Fecha;
import ingenieros.Ingeniero;
import recursosTecnologicos.RecursoTecnologico;
import java.util.*;

public abstract class ProyectoTecnologico {

    private String proyectoID; //ID unico generado por el constructor (inmodificable?)
    private String titulo, descripcion;
    private float presupuesto;
    private Fecha fechaInicio, fechaFin;
    private List<Ingeniero> ingenieros = new ArrayList<>();
    private List<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();

    public ProyectoTecnologico() {
        this.proyectoID = generarCodigo();
    }

    public ProyectoTecnologico(String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        this.proyectoID = generarCodigo();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    // metodos abstractos
    public abstract String getTipo();
    
    public abstract String getWare();
    
    //default
    public void setProyectoID(String proyectoID) {
        this.proyectoID = proyectoID;
    }
    
    public String getProyectoID() {
        return proyectoID;
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

    //metodos para modificar ingenieros y recursos tecnologicos
    public void agregarIngeniero(Ingeniero ingeniero) {
        ingenieros.add(ingeniero);
    }

    public boolean eliminarIngeniero(Ingeniero ingeniero) {
        return ingenieros.remove(ingeniero);
    }

    public void agregarRecursoTecnologico(RecursoTecnologico recurso) {
        recursosTecnologicos.add(recurso);
    }

    public boolean eliminarRecursoTecnologico(RecursoTecnologico recurso) {
        return recursosTecnologicos.remove(recurso);
    }

    public int obtenerCantidadIngenieros() {
        return ingenieros.size();
    }

    public int obtenerCantidadRecursosTecnologicos() {
        return recursosTecnologicos.size();
    }
    
    public ArrayList<Ingeniero> obtenerTodosLosIngenieros() {
        return new ArrayList<>(ingenieros);  // Devuelve una copia de la lista
    }

    public ArrayList<RecursoTecnologico> obtenerTodosLosRecursosTecnologicos() {
        return new ArrayList<>(recursosTecnologicos);  // Devuelve una copia de la lista
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", descripcion=" + descripcion + ", presupuesto=" + presupuesto + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    /* Abajo metodos adicionales */
    
    public static String generarCodigo() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }
        return codigo.toString();
    }
    
}
