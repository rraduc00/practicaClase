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

	public void setDay(int day){
		try{
			parser.checkDayFormat(day, this.month);
			this.day = day;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
		}
	}

	public void setMonth(int month){
		try{
			parser.checkMonthFormat(month);
			this.month = month;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
		}
	}

	public void setYear(int year){
		try{
			parser.checkYearFormat(year);
			this.year = year;
		} catch (DateErrorException errorMsg) {
			System.err.println(errorMsg);
		}
	}

	public void setDate(int day, int month, int year){
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

	public String getMonthsLeft(){
		Date aux = new Date(this);
		StringBuffer monthsLeft = new StringBuffer();
		for(int i = month + 1 ; i < 13; i++ ){
				aux.setMonth(i);
				monthsLeft.append(aux.getMonthName() + " ");
		}
		return monthsLeft.toString();
	}


	public String getDaysUntilMonthsEnd(){
		StringBuffer daysLeft = new StringBuffer("The days until the months end are: ");
		int diaAuxiliar = this.day+1;
		while(parser.checkIfDayIsRight(diaAuxiliar, this.month)){
			daysLeft.append(diaAuxiliar + " ");
			diaAuxiliar++;
		}
		return daysLeft.toString();
	}
	
	public String getMonthsWithSameDaysNumber(){
		StringBuffer months = new StringBuffer("The months with same days number as "+getMonthName()+" are: ");
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				months.append("January, March, May, July, August, October y December.");
			break;

			case 2:
				months.append("February is unique.");
			break;

			case 4: case 6: case 9: case 11:
				months.append("April, June, September y November.");
			break;
		}
		return months.toString();
	}

	public int countDaysSinceBeggining(){
		int days = this.day;
		Date auxiliarDate = new Date(this.day, this.month - 1, this.year);
		if(auxiliarDate.getMonth() != 1){
			for(int i = auxiliarDate.getMonth(); i > 0; ){
				days += auxiliarDate.getMonthTotalDays();
				i--;
				auxiliarDate.setMonth(i);
			}
		}
		return days;
	}

	public int getMonthTotalDays(){
		int totalDays = 0;
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				totalDays = 31;
			break;

			case 2:
				totalDays = 28;
			break;

			case 4: case 6: case 9: case 11:
				totalDays = 30;
			break;
		}
		return totalDays;
	}

	public int randomAttemptsWhile(){
		int dayGuess = 0; 
		int monthGuess = 0;
		int attemptsNumber = 0;
		while(dayGuess != this.day || monthGuess != this.month){
			dayGuess = randomWithinRange(1, this.day);
			//System.out.println("dayGuess ha salido: " + dayGuess);
			monthGuess = randomWithinRange(1, this.month);
			//System.out.println("monthGuess ha salido: " + monthGuess);
			attemptsNumber++;
		}
		return attemptsNumber;
	}

	public int randomAttemptsDoWhile(){
		int dayGuess = 0; 
		int monthGuess = 0;
		int attemptsNumber = 0;
		do{
			dayGuess = randomWithinRange(1, this.day);
			//System.out.println("dayGuess ha salido: " + dayGuess);
			monthGuess = randomWithinRange(1, this.month);
			//System.out.println("monthGuess ha salido: " + monthGuess);
			attemptsNumber++;
		}while(dayGuess != this.day || monthGuess != this.month);
		return attemptsNumber;
	}

	public int randomWithinRange(int min, int max){
		int range = (max - min) + 1;     
   		return (int)(java.lang.Math.random() * range) + min;
	}

	public String toString(){
		return "The date is: " + day + " of " + month + " of year " + year;
	}

	public String showDayOfTheWeek(){
		/*N = d + 2m + [3(m+1)/5] + y + [y/4] - [y/100] + [y/400] + 2
		where d is the number or the day of the month, m is the number of the 
		month, and y is the year. The brackets around the divisions mean to 
		drop the remainder and just use the integer part that you get.

		Also, a VERY IMPORTANT RULE is the number to use for the months for 
		January and February. The numbers of these months are 13 and 14 of the 
		PREVIOUS YEAR. This means that to find the day of the week of New 
		Year's Day this year, 1/1/98, you must use the date 13/1/97. (It 
		sounds complicated, but I will do a couple of examples for you.)

		After you find the number N, divide it by 7, and the REMAINDER of that 
		division tells you the day of the week; 1 = Sunday, 2 = Monday, 3 = 
		Tuesday, etc; BUT, if the remainder is 0, then the day is Saturday, 
		that is: 0 = Saturday*/

		StringBuffer dayOfGivenDate = new StringBuffer();
		int d = this.day;
		int m = this.month;
		int y = this.year;

		if(m == 1){
			y -= 1;
			m = 13;
		} else if(m == 2){
			y -= 1;
			m = 14;
		}
		/*
		0 - Sabado
		1 - Domingo
		2 - Lunes
		3 - Martes
		4 - Miercoles
		5 - Jueves
		6 - Viernes
		*/

		int dayOfDate = (d + 2*m + 3*(m+1)/5 + y + y/4 - y/100 + y/400 + 2)%7;

		switch(dayOfDate){
			case 2:
				dayOfGivenDate.append("Monday");
			break;
			case 3:
				dayOfGivenDate.append("Tuesday");
			break;
			case 4:
				dayOfGivenDate.append("Wednesday");
			break;
			case 5:
				dayOfGivenDate.append("Thursday");
			break;
			case 6:
				dayOfGivenDate.append("Friday");
			break;
			case 0:
				dayOfGivenDate.append("Saturday");
			break;
			case 1:
				dayOfGivenDate.append("Sunday");
			break;

		}

		return dayOfGivenDate.toString();
	}
}