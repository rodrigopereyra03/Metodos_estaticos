package models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Funciones {
	
	
	public static boolean esDiaHabil(LocalDate fecha) {
		int d = fecha.getDayOfWeek().getValue();
		
		return ((d>=1)&&(d<=5));
	}
	
	public static boolean esBisiesto(int anio) {
		 return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));
	}
	
	public static boolean esFechaValida(LocalDate fecha) {
		int year = fecha.getYear();
		return fecha.getDayOfMonth() > 0 && fecha.getMonthValue() > 0 && fecha.getMonthValue() <= 12 && 
				(fecha.getMonthValue() != 2 || (esBisiesto(year) && fecha.getDayOfMonth() <=29) || fecha.getDayOfMonth() <= 28);
	}
	
	public static String traerFechaCorta(LocalDate fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fecha.format(formatter);
	}
	
	public static String traerHoraCorta(LocalTime hora) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
		return hora.format(formatter);
	}
	

    public static String traerDiaDeLaSemana(LocalDate fecha) {
        DayOfWeek dayOfWeek = fecha.getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY:
                return "Lunes";
            case TUESDAY:
                return "Martes";
            case WEDNESDAY:
                return "Miércoles";
            case THURSDAY:
                return "Jueves";
            case FRIDAY:
                return "Viernes";
            case SATURDAY:
                return "Sábado";
            case SUNDAY:
                return "Domingo";
            default:
                return "Desconocido";
        }
    }
    
    public static String traerMesEnLetras(LocalDate fecha) {
        Month month = fecha.getMonth();
        switch (month) {
            case JANUARY:
                return "Enero";
            case FEBRUARY:
                return "Febrero";
            case MARCH:
                return "Marzo";
            case APRIL:
                return "Abril";
            case MAY:
                return "Mayo";
            case JUNE:
                return "Junio";
            case JULY:
                return "Julio";
            case AUGUST:
                return "Agosto";
            case SEPTEMBER:
                return "Septiembre";
            case OCTOBER:
                return "Octubre";
            case NOVEMBER:
                return "Noviembre";
            case DECEMBER:
                return "Diciembre";
            default:
                return "Desconocido";
        }
    }
    
    public static String traerFechaLarga(LocalDate fecha) {
    	DayOfWeek dayOfWeek = fecha.getDayOfWeek();
    	Month month = fecha.getMonth();
    	return "Es " + dayOfWeek + " de " + month + " del "  + fecha.getYear(); 
    	
    	
    }
 
}
