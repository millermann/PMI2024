package ingenieros;

import fecha.Fecha;

public class Ingeniero {

    private final String idIngeniero;
    private String nombre, apellido, mail, especialidad;
    private Fecha fechaContratacion;
    private String[] idsProyectosAsociados = new String[]{"No Asignado", "No Asignado", "No Asignado"};
    
    private static int cantidadDeIngenieros = 0;

    //private int cantidadProyectos = 0; a evaluar
    
    public Ingeniero() {
        idIngeniero = "ING"+cantidadDeIngenieros;
        this.nombre = "No Asignado";
        this.apellido = "No Asignado";
        this.mail = "No Asignado";
        this.especialidad = "No Asignado";
        this.fechaContratacion = new Fecha();

        cantidadDeIngenieros++;
    }

    public Ingeniero(String nombre, String apellido, String mail, String especialidad, Fecha fechaContratacion) {
        idIngeniero = "ING"+cantidadDeIngenieros;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.especialidad = especialidad;
        this.fechaContratacion = fechaContratacion;
        cantidadDeIngenieros++;
    }
    
    /**
     * @return the idIngeniero
     */
    public String getIdIngeniero() {
        return idIngeniero;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the fechaContratacion
     */
    public Fecha getFechaContratacion() {
        return fechaContratacion;
    }

    /**
     * @param fechaContratacion the fechaContratacion to set
     */
    public void setFechaContratacion(Fecha fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * @return the idsProyectosAsociados
     */
    public String[] getIdsProyectosAsociados() {
        return idsProyectosAsociados;
    }

    /**
     * @param idsProyectosAsociados the idsProyectosAsociados to set
     */
    public void setIdsProyectosAsociados(String[] idsProyectosAsociados) {
        this.idsProyectosAsociados = idsProyectosAsociados;
    }

    /**
     * @return the cantidadDeIngenieros
     */
    public static int getCantidadDeIngenieros() {
        return cantidadDeIngenieros;
    }

    /**
     * @param aCantidadDeIngenieros the cantidadDeIngenieros to set
     */
    public static void setCantidadDeIngenieros(int aCantidadDeIngenieros) {
        cantidadDeIngenieros = aCantidadDeIngenieros;
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", mail=" + getMail() + ", especialidad=" + getEspecialidad() + ", fechaContratacion=" + getFechaContratacion() + '}';
    }

    /* Abajo metodos adicionales */
    
    /**
     *
     * @return devuelve true si el ingeniero esta asociado a 3 proyectos
     */
    public boolean getDisponible() {

        for (int i = 0; i < idsProyectosAsociados.length; i++) {
            if (idsProyectosAsociados[i].equals("No Asignado")) {
                return true;
            }
        }

        return false;
    }
    
    public void reemplazarIdProyectosAsociados(String idNuevo, String idViejo){
        for (int i = 0; i < 3; i++) {
            if (idsProyectosAsociados[i].equals(idViejo) == true){
                idsProyectosAsociados[i] = idNuevo;
                break;
            }
        }
    }
}
