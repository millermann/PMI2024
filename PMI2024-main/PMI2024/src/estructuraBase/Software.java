package estructuraBase;

public class Software extends Proyecto {
    private String tipo;
    
    public Software(){}
    
    public Software(String titulo, String descripcion, Fecha inicio, Fecha fin, String tipo){
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.getFecInicio().copyFecha(inicio);
        this.getFecFin().copyFecha(fin);
        this.setTipo(tipo);
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
