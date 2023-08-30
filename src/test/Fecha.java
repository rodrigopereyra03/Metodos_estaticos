package test;

import java.time.LocalDate;
import java.time.LocalTime;

import models.Funciones;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2016,02,29);
		LocalTime time = LocalTime.now();
		
		System.out.println(date);
		System.out.println(time);
		
		System.out.println(Funciones.esDiaHabil(LocalDate.of(2023,8,30)));
		System.out.println(Funciones.esBisiesto(2000));
		System.out.println(Funciones.esFechaValida(date));
		System.out.println(Funciones.traerFechaCorta(date));
		System.out.println(Funciones.traerHoraCorta(time));
		System.out.println(Funciones.traerDiaDeLaSemana(date));
		System.out.println(Funciones.traerMesEnLetras(date));
		System.out.println(Funciones.traerFechaLarga(date));
		

	}

}
