package ca.poltech.mybank.misc;

public class Constants {
	public static final String CANADA_POSTAL_CODE_REGEX = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
	public static final String DECIMAL_NUMBER_REGEX = "[-+]?[0-9]*\\.?[0-9]+";
	public static final String BIRTH_DATE_REGEX = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
	public static final String BIRTH_DATE_ACCEPTED_FORMAT = "dd/mm/yyyy";
	
	
	public static final String EMAIL_ACCEPTED_FORMAT = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	public static final double MINIMUM_CREDIT_CARD_PAYMENT = 0.03;
	public static final double CREDIT_CARD_PAYMENT_PERIOD_IN_DAYS = 30;
	public static final double CREDIT_CARD_LATE_PAYMENT_DAYLY_CHARGE = 0.03;
	public static final double CREDIT_CARD_INCOMPLETE_PAYMENT_CHARGE = 0.03;
}
	

