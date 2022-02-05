package hackerRank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {

	private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="07:05:45PM";
		System.out.println(timeConversion(s));
	}
	
	public static String timeConversion(String s) {
	    // Write your code here
	    try {
	            return TWENTY_FOUR_TF.format(
	                    TWELVE_TF.parse(s));
	        } catch (ParseException e) {
	            return s;
	        }
	    }

}
