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
		if(!checkIfDayIsRight(day, month)){
				errorMessage.append("The inserted day is not correct according to the inserted month. ");
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

	public boolean checkIfDayIsRight(int day, int month){
		boolean isRight = true;
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day < 1 || day > 31)
					isRight = false;
			break;

			case 2:
				if(day < 1 || day > 28)
					isRight = false;
			break;

			case 4: case 6: case 9: case 11:
				if(day < 1 || day > 30)
					isRight = false;
			break;
		}
		return isRight;
	}
}