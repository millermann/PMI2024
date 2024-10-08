package pmi2024;

import fecha.Fecha;
import ingenieros.Ingeniero;
import java.util.ArrayList;
import proyectos.DesarrolloDeHardware;
import proyectos.DesarrolloDeSoftware;
import proyectos.ProyectoTecnologico;
import recursosTecnologicos.RecursoTecnologico;

public class PMI2024 {

    public static void main(String[] args) {
        
        ArrayList<Ingeniero> arrayIngenieros = new ArrayList<>();
        ArrayList<ProyectoTecnologico> arrayProyectos = new ArrayList<>();
        ArrayList<RecursoTecnologico> arrayRecursos = new ArrayList<>();
        
        arrayProyectos.add(new DesarrolloDeSoftware("Facebook", "Red Social", "La vamos a re pegar negritooo", (float) 1000, new Fecha(12,12,2000), new Fecha()));
        arrayProyectos.add(new DesarrolloDeSoftware("Instagram", "Red Social", "la de las fotos y las trolas", (float) 1000000, new Fecha(12,12,2009), new Fecha()));
        arrayProyectos.add(new DesarrolloDeHardware("Nokia 1100", "Telefono Celular", "Duro durito", (float) 1800200, new Fecha(12,12,2000), new Fecha(2,12,2005)));
        arrayIngenieros.add(new Ingeniero("Paco", "Zabala", "loquito@gmail.com", "flautista", new Fecha()));
        arrayIngenieros.add(new Ingeniero("Carlos", "Garcia", "snm@gmail.com", "clavadista", new Fecha()));
        arrayIngenieros.add(new Ingeniero("lolo", "Garcia", "snm@gmail.com", "clavadista", new Fecha()));
        arrayIngenieros.add(new Ingeniero("pepe", "Garcia", "snm@gmail.com", "clavadista", new Fecha()));
        arrayIngenieros.add(new Ingeniero("sono", "Garcia", "snm@gmail.com", "clavadista", new Fecha()));
        arrayIngenieros.add(new Ingeniero("bono", "Garcia", "snm@gmail.com", "clavadista", new Fecha()));
        arrayRecursos.add(new RecursoTecnologico("Servidor", "una coradir del 2011"));
        arrayRecursos.add(new RecursoTecnologico("Destornillador", "ha sido robado..."));
        GUI ventana = new GUI(arrayIngenieros, arrayProyectos, arrayRecursos);
        
        
        ventana.setVisible(true);
    }
    
    
}
