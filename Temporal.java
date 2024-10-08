/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temporal;

/**
 *
 * @author Estudiante
 */
public class Temporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private void botonCargarProyectoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        int dia, mes, anio, i;
        float presupuesto;
        String titulo, descripcion, tipo;
        Fecha fechaInicio, fechaFin;
        Ingeniero ingeniero;
        RecursoTecnologico recursoTecnologico;
        List<Ingeniero> ingenieros = new ArrayList<>();
        List<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
        
        presupuesto = ((float)spinnerProyectoPresupuesto.getValue());
        titulo = campoProyectoTitulo.getText();
        descripcion = campoProyectoDescripcion.getText();
        tipo = campoProyectoTipo.getText();
        Date fecha = (Date)spinnerFechaInicio.getValue();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        fechaInicio = new Fecha(calendario.get(Calendar.DAY_OF_MONTH), calendario.get(Calendar.MONTH + 1), calendario.get(Calendar.YEAR));
        fecha = (Date)spinnerFechaFin.getValue();
        calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        fechaFin = new Fecha(calendario.get(Calendar.DAY_OF_MONTH), calendario.get(Calendar.MONTH + 1), calendario.get(Calendar.YEAR));

        
        
        if (radioHardware.isSelected())
        {
            DesarrolloDeHardware proyecto = new DesarrolloDeHardware(titulo, tipo, descripcion, presupuesto, fechaInicio, fechaFin);
            for (Ingeniero x : ingenieros)
            {
                proyecto.agregarIngeniero(x);
            }
            for (RecursoTecnologico y : recursosTecnologicos)
            {
                proyecto.agregarRecursoTecnologico(y);
            }
            arrayProyectos.add(proyecto);
        }
        if (radioSoftware.isSelected())
        {
            DesarrolloDeSoftware proyecto = new DesarrolloDeSoftware(titulo, tipo, descripcion, presupuesto, fechaInicio, fechaFin);
            for (Ingeniero x : ingenieros)
            {
                proyecto.agregarIngeniero(x);
            }
            for (RecursoTecnologico y : recursosTecnologicos)
            {
                proyecto.agregarRecursoTecnologico(y);
            }
            arrayProyectos.add(proyecto);
        }
    }
    
}
