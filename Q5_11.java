package utsystem;

import java.util.Calendar;
import java.util.Scanner;

public class Q5_11 {

	public static void main(String[] args) {

		CalendarDayOfWeek ct = new CalendarDayOfWeek();

		Scanner stdln = new Scanner(System.in);
		System.out.print("年：");
		int y = stdln.nextInt();
		System.out.print("年：");
		int m = stdln.nextInt();


	}

}
	private static final int[] WEEK =
		{
				Calendar.SUNDAY,
				Calendar.MONDAY,
				Calendar.TUESDAY,
				Calendar.WEDNESDAY,
				Calendar.THURSDAY,
				Calendar.FRIDAY,
				Calendar.SATURDAY,};

	private static final String[] WEEK_JA = {"日","月","火","水","木","金","土"};

}

	public String getDayOfWeek(int y, int m ,int d){
		Calendar cal = Calendar.getInstance();

}