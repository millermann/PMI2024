package ingenieros;

import fecha.Fecha;

public class Ingeniero {
    private String nombre, apellido, mail, especialidad;
    private Fecha fechaContratacion;
    private int cantidadProyectos = 0;
    private static int cantidad = 0;

    public Ingeniero() {
        this.nombre = " ";
        this.apellido = " ";
        this.mail = " ";
        this.especialidad = " ";
        this.fechaContratacion = new Fecha();
        cantidad++;
    }

    public Ingeniero(String nombre, String apellido, String mail, String especialidad, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.especialidad = especialidad;
        this.fechaContratacion = fechaContratacion;
        cantidad++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Fecha getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Fecha fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public static int getCantidad() {
        return cantidad;
    }    
    
    public boolean aumentarCantidadProyectos()
    {
        if (this.cantidadProyectos==3)
        {
            return false;
        }
        else
        {
            this.cantidadProyectos++;
            return true;
        }
    }
    
    public boolean reducirCantidadProyectos()
    {
        if (this.cantidadProyectos==0)
        {
            return false;
        }
        else
        {
            this.cantidadProyectos--;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", especialidad=" + especialidad + ", fechaContratacion=" + fechaContratacion + '}';
    }
    
}
