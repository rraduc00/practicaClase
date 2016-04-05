package es.unileon.prg.practicaDate;
/**
 * Clase Date.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 */

public class Date{
	int day, month, year;
	DataValidator parser = new DataValidator();
	
	public Date(){
		this.day = 1;
		this.month = 1;
		this.year = 2016;
	}

	public Date(int day, int month, int year) throws DateErrorException{
		if(parser.checkDataFormat(day, month, year)){
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			throw new DateErrorException("Invalid date format! Fatal error.");
		}
	}

	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public getYear(){
		return this.year;
	}



}