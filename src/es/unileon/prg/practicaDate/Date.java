package es.unileon.prg.practicaDate;
/**
 * Clase Date.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 */

public class Date{
	private int day;
	private int month;
	private int year;
	DataValidator parser = new DataValidator();
	
	public Date(){
		this.day = 1;
		this.month = 1;
		this.year = 2016;
	}

	public Date(Date obj){
		this.day = obj.getDay();
		this.month = obj.getMonth();
		this.year = obj.getYear();
	}

	public Date(int day, int month, int year) {
		try{
			parser.checkDataFormat(day, month, year);
			this.day = day;
			this.month = month;
			this.year = year;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
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
		try{
			parser.checkDayFormat(day);
			this.day = day;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
		}
	}

	public void setMonth(int month) throws DateErrorException{
		try{
			parser.checkMonthFormat(month);
			this.month = month;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
		}
	}

	public void setYear(int year) throws DateErrorException{
		try{
			parser.checkYearFormat(year);
			this.year = year;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
		}
	}

	public void setDate(int day, int month, int year) throws DateErrorException{
		try{
			parser.checkDataFormat(day, month, year);
			this.day = day;
			this.month = month;
			this.year = year;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
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
				monthName = "January";
			break;
			case 2:
				monthName = "February";
			break;
			case 3:
				monthName = "March";
			break;
			case 4:
				monthName = "April";
			break;
			case 5:
				monthName = "May";
			break;
			case 6:
				monthName = "June";
			break;
			case 7:
				monthName = "July";
			break;
			case 8:
				monthName = "August";
			break;
			case 9:
				monthName = "September";
			break;
			case 10:
				monthName = "October";
			break;
			case 11:
				monthName = "November";
			break;
			case 12:
				monthName = "December";
			break;
		
		}
		return monthName;
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
		return monthSeason;
	}

	public String getMonthsLeft() throws DateErrorException{
		Date aux = new Date(this);
		StringBuffer monthsLeft = new StringBuffer();
		for(int i = month + 1 ; i < 13; i++ ){
			try{
				aux.setMonth(i);
			} catch (DateErrorException errorMsg) {
				System.err.println(errorMsg);
			}
				monthsLeft.append(aux.getMonthName() + " ");
		}
		return monthsLeft.toString();
	}


	/////// For a date, print all dates until the end of the month.  ??????????
	

	public String toString(){
		return "The date is: " + day + " of " + month + " of year " + year;
	}
}