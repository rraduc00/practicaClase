package es.unileon.prg.practicaDate;
/**
 * Clase para probar que todo funciona en Date. Aquí está el main.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 */

public class DataClassTesting{
	public static void main(String[] args) throws DateErrorException {

	//Esto da error, las excepciones funcionan bien. 
		//Date wrongFormatDate = new Date(0,1,2000); Funciona
		
	/*
	//Voy a comprobar los setters. Tanto su funcionamiento como las excpeciones
	Date myDate = new Date(5,5,2015);
	myDate.setDate(5,5,-5);
	myDate.setYear(0); // Este es el único correcto
	myDate.setMonth(0);
	myDate.setDay(0);
	//Funcionan perfectamente. Sacan todos los errores.	
	/*

	/*
	//Compruebo que salta el error del día incorrecto en función del mes.
	Date myDate2 = new Date(31,5,2015); 
	//Funciona perfectamente.
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

	/*
	//Voy a comprobar el get month left y el get month season
	Date myDate = new Date(5,5,2015);
	System.out.println(myDate.getMonthsLeft());
	System.out.println(myDate.getMonthSeason());
	//Funciona correctamente
	*/

	/*
	//Voy a probar que me imprime los días restantes hasta que acaba el mes con una fecha dada
	Date myDate = new Date(10,2,2016);
	System.out.println(myDate.getDaysUntilMonthsEnd());
	//Funciona perfectamente
	*/

	/*
	//Voy a probar el método getMonthsWithSameDaysNumber()
	Date myDate = new Date(10,1,2016);
	System.out.println(myDate.getMonthsWithSameDaysNumber());
	//Funciona perfectamente
	*/

	/*
	//Voy a comprobar que funciona el metodo countDaysSinceBeggining()
	//Date myDate = new Date(15, 01, 2016);
	//System.out.println(myDate.countDaysSinceBeggining()); //salida -> 15
	Date myDate = new Date(15, 03, 2016);
	System.out.println(myDate.countDaysSinceBeggining()); //salida - > 74 = 15+28+31 Es correcto
	//Funciona perfectamente
	*/

	/*
	//Voy a probar el método random number attemps con while
	Date myDate = new Date(5,5,2015);
	System.out.println("El numero de intentos ha sido: " + myDate.randomAttemptsWhile() + " con while");
	//Funciona perfectamente
	
	//Voy a probar el método random number attemps con do-while
	Date myDate15 = new Date(5,5,2015);
	System.out.println("El numero de intentos ha sido: " + myDate.randomAttemptsDoWhile() + " con do-while");
	//Funciona perfectamente
	*/

	/*
	//Voy a probar el método showDayOfTheWeek() con algunas fechas aleatorias.
	Date myDate20 = new Date(10,1,2016); 
	Date myDate21 = new Date(10,1,1996);
	Date myDate22 = new Date(10,12,2016);
	Date myDate23 = new Date(5,5,2005);
	Date myDate24 = new Date(28,2,2003);

	System.out.println(myDate20.showDayOfTheWeek()); // Esto debería ser Sunday
	System.out.println(myDate21.showDayOfTheWeek()); // Esto debería ser wednesday
	System.out.println(myDate22.showDayOfTheWeek()); // Esto debería ser Saturday
	System.out.println(myDate23.showDayOfTheWeek()); // Esto debería ser Thursday
	System.out.println(myDate24.showDayOfTheWeek()); // Esto debería ser Friday
	//Funciona perfectamente
	*/

	/*
	//Voy a probar que el método toString funciona y es invocado por defecto al imprimir el objeto
	Date myDate2 = new Date(10,1,2016);
	System.out.println(myDate2);
	//Funciona perfectamente
	*/

	/*
	//Voy a probar el método tomorrow()
	Date myDate79 = new Date(28,02,2015);
	System.out.println(myDate79.tomorrow()); // esto debería imprimirme el 1 de marzo de 2015
	Date myDate80 = new Date(31,12,2015);
	System.out.println(myDate80.tomorrow()); // esto debería imprimirme el 1 de enero de 2016
	//Funciona perfectamente
	*/
    }
}