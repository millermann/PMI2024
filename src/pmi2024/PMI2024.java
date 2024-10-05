package pmi2024;

import fecha.Fecha;
import ingenieros.Ingeniero;
import java.util.ArrayList;
import proyectos.DesarrolloDeSoftware;
import proyectos.ProyectoTecnologico;

public class PMI2024 {

    public static void main(String[] args) {
        
        ArrayList<Ingeniero> arrayIngenieros = new ArrayList<>();
        ArrayList<ProyectoTecnologico> arrayProyectos = new ArrayList<>();
        
        arrayProyectos.add(new DesarrolloDeSoftware("Facebook", "Red Social", "La vamos a re pegar negritooo", (float) 1000, new Fecha(12,12,2000), new Fecha()));
        arrayIngenieros.add(new Ingeniero("Paco", "Zabala", "loquito@gmail.com", "flautista", new Fecha()));
        
        GUI ventana = new GUI(arrayIngenieros, arrayProyectos);
        
        
        ventana.setVisible(true);
    }
    
    
}
