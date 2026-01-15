package practice;

import genericUtility.JavaUtility;

public class practicejavautility {

	public static void main(String[] args) {
		JavaUtility jutil=new JavaUtility();
		int number=jutil.generaterandomnumber(2000);
		System.out.println(number);
		String value = jutil.getcalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(value);

	}

}
