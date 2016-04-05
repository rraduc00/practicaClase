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

	public boolean isSameYear(Date anotherDate){
		return this.year == anotherDate.getYear();
	}

	public boolean isSameMonth(Date anotherDate){
		return this.month == anotherDate.getMonth();
	}

	public boolean isSameDay(Date anotherDate){
		return this.day == anotherDate.getDay();
	}

	public boolean isSame(Date anotherDate){
		return(this.day == anotherDate.getDay() && this.month == anotherDate.getMonth() 
			&& this.year == anotherDate.getYear());
	}

	public String getMonthName(){
		String monthName = "";
		switch(this.month){
			case 1:
				month = "January";
			break;
			case 2:
				month = "February";
			break;
			case 3:
				month = "March";
			break;
			case 4:
				month = "April";
			break;
			case 5:
				month = "May";
			break;
			case 6:
				month = "June";
			break;
			case 7:
				month = "July";
			break;
			case 8:
				month = "August";
			break;
			case 9:
				month = "September";
			break;
			case 10:
				month = "October";
			break;
			case 11:
				month = "November";
			break;
			case 12:
				month = "December";
			break;
		return month;
		}
	}

	//////////// A method that checks if the day of the month is right  ??????

	public String getSpecificMonthName(int month){
		String monthName = "";
		switch(month){
			case 1:
				month = "January";
			break;
			case 2:
				month = "February";
			break;
			case 3:
				month = "March";
			break;
			case 4:
				month = "April";
			break;
			case 5:
				month = "May";
			break;
			case 6:
				month = "June";
			break;
			case 7:
				month = "July";
			break;
			case 8:
				month = "August";
			break;
			case 9:
				month = "September";
			break;
			case 10:
				month = "October";
			break;
			case 11:
				month = "November";
			break;
			case 12:
				month = "December";
			break;
		return month;
		}
	}

	public String getMonthSeason(){
		String monthSeason ="";
		switch(this.month){
			case 3: case 4: case 5:
				monthSeason = "Spring";
			break;
			case 6: case 7: case 8:
				monthSeason = "Summer";
			break;
			case 9: case 10: case 11:
				monthSeason = "Autumn";
			break;
			case 12: case 1: case 2:
				monthSeason = "Winter";
			break;
		}
	}

	public String getMonthsLeft(){
		Stringbuffer monthsLeft = new StringBuffer();
		for(int i = month; i < 13; i++ ){
			monthsLeft.append(getSpecificMonthName(i));
		}
		return monthsLeft.toString();
	}


	/////// For a date, print all dates until the end of the month.  ??????????
	

	public String toString(){
		return "The date is: " + day + " of " + month + " of year " + year;
	}
}