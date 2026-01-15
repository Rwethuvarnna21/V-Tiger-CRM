package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/*This is an utility class which has functionality from java library
 * 
 */
public class JavaUtility {
/*this is a generic method to generate calendar details for the given pattern
 * 
 */
	public String getcalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	/**
	 * this generic method to generate random number for the given boundary
	 * @param bound
	 * @return
	 */
	public int generaterandomnumber(int bound) {
		Random r=new Random();
		int num = r.nextInt(bound);
		return num;
	}
}

