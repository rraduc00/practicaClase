package es.unileon.prg.practicaDate;
/**
 * Clase para comprobar que los datos introducidos son correctos.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 **/

public class DataValidator{
	/*
	int day, month, year;
	public DataValidator(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	*/

	public void checkDataFormat(int day, int month, int year) throws DateErrorException{
		StringBuffer errorMessage = new StringBuffer();
		if(day < 1) {
				errorMessage.append("You are not allowed to introduce negative days or zero. ");
		}
		if(day > 31) {
				errorMessage.append("You are not allowed to introduce bigger day than 31. ");
		}
		if(month < 1) {
				errorMessage.append("You are not allowed to introduce months lower than 1. ");
		}
		if(month > 12) {
				errorMessage.append("You are not allowed to introduce months bigger than 12. ");
		}
		if(year < 0) {
				errorMessage.append("You are not allowed to introduce negative years. ");
		}
		if(year > 2020) {
				errorMessage.append("You are not allowed to introduce very distant years. ");
		}
		if(errorMessage.length() != 0){
			throw new DateErrorException(errorMessage.toString());
		}
	}

	public void checkDayFormat(int day) throws DateErrorException{
		StringBuffer errorMessage = new StringBuffer();
		if(day < 1) {
				errorMessage.append("You are not allowed to introduce negative days or zero. ");
		}
		if(day > 31) {
				errorMessage.append("You are not allowed to introduce bigger day than 31. ");
		}
		if(errorMessage.length() != 0){
			throw new DateErrorException(errorMessage.toString());
		}
	}

	public void checkMonthFormat(int month) throws DateErrorException{
		StringBuffer errorMessage = new StringBuffer();
		if(month < 1) {
				errorMessage.append("You are not allowed to introduce months lower than 1. ");
		}
		if(month > 12) {
				errorMessage.append("You are not allowed to introduce months bigger than 12. ");
		}
		if(errorMessage.length() != 0){
			throw new DateErrorException(errorMessage.toString());
		}
	}

	public void checkYearFormat(int year) throws DateErrorException{
		StringBuffer errorMessage = new StringBuffer();
		if(year < 0) {
				errorMessage.append("You are not allowed to introduce negative years. ");
		}
		if(year > 2020) {
				errorMessage.append("You are not allowed to introduce very distant years. ");
		}
		if(errorMessage.length() != 0){
			throw new DateErrorException(errorMessage.toString());
		}
	}
}