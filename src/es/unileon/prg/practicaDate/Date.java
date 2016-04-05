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

	public int getYear(){
		return this.year;
	}

	public void setDay(int day) throws DateErrorException{
		if(parser.checkDayFormat(day)){
			this.day = day;
		} else {
			throw new DateErrorException("Invalid day format! Fatal error.");
		}
	}

	public void setMonth(int month) throws DateErrorException{
		if(parser.checkMonthFormat(month)){
			this.month = month;
		} else {
			throw new DateErrorException("Invalid month format! Fatal error.");
		}
	}

	public void setYear(int year) throws DateErrorException{
		if(parser.checkYearFormat(year)){
			this.year = year;
		} else {
			throw new DateErrorException("Invalid year format! Fatal error.");
		}
	}

	public void setDate(int day, int month, int year) throws DateErrorException{
		if(parser.checkDataFormat(day, month, year)){
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			throw new DateErrorException("Invalid date format! Fatal error.");
		}
	}

}