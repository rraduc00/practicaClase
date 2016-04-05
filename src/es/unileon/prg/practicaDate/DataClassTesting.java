package es.unileon.prg.practicaDate;
/**
 * Clase para probar que todo funciona en Date. Aquí está el main.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 */

public class DataClassTesting{
	public static void main(String[] args) throws DateErrorException {

	//Esto da error, las excepciones funcionan bien. Date wrongFormatDate = new Date(0,1,2000);
		
	/*//Voy a comprobar los setters. Tanto su funcionamiento como las excpeciones
	Date myDate = new Date(5,5,2015);
	myDate.setYear(5,5,0);
	myDate.setYear(0);
	myDate.setMonth(0);
	myDate.setDay(0);
	//Funcionan perfectamente	
	*/
	/*
	//Voy a crear dos fechas distintas para comprobar los métodos. Según la salida que impriman
	//sabré si funcionan bien o no.
	Date myDate = new Date(5,12,1994);
	Date anotherDate = new Date(5,12,1993);
	if(myDate.isSameYear(anotherDate)) {
		System.out.println("Son el mismo anio");
	} else {
		System.out.println("No son el mismo anio");
	}

	if(myDate.isSameMonth(anotherDate)) {
		System.out.println("Son el mismo mes");
	} else {
		System.out.println("No son el mismo mes");
	}

	if(myDate.isSameDay(anotherDate)) {
		System.out.println("Son el mismo dia");
	} else {
		System.out.println("No son el mismo dia");
	}

	if(myDate.isSame(anotherDate)) {
		System.out.println("Son la misma fecha");
	} else {
		System.out.println("No son la misma fecha");
	}
	//Funcionan perfectamente
	*/

    }
}