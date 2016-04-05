package es.unileon.prg.practicaDate;
/**
 * Clase para comprobar que los datos introducidos son correctos.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 **/

public class DataValidator{
	int day, month, year;
	/*
	public DataValidator(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	*/

	public boolean checkDataFormat(int day, int month, int year){
		return (day > 0 && day < 32 && month > 0 && month < 13 && year > 0 && year < 2016);
	}

}