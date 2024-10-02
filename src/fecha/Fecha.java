/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fecha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Fecha {
    private int dia, mes, anio;

    public Fecha() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        LocalDate fechaActual = fechaHoraActual.toLocalDate();
        LocalTime horaActual = fechaHoraActual.toLocalTime();
        this.dia = fechaActual.getDayOfMonth();
        this.mes = fechaActual.getMonthValue();
        this.anio = fechaActual.getYear();
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int cantDia(Fecha d)
    {
        int cantidad, diaActual;
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        LocalDate fechaActual = fechaHoraActual.toLocalDate();
        LocalTime horaActual = fechaHoraActual.toLocalTime();
        diaActual = fechaActual.getDayOfMonth();
        cantidad = d.getDia() - diaActual;
        return cantidad;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
    
}