package es.unileon.prg.practicaDate;

/**
 * Clase para definir la excepción.
 * 
 * @author Razvan Raducu X5526828C
 * @version 1.0
 */

public class DateErrorException extends Exception {
	public DateErrorException(String msg){
		super(msg);
	}
}