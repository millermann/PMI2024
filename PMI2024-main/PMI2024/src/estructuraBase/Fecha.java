package estructuraBase;

// usar LocalDate??

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){}
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    /*Funciones adicionales*/

    public void copyFecha(Fecha fechaB){
        this.dia = fechaB.dia;
        this.mes = fechaB.mes;
        this.anio = fechaB.anio;
    }
}
