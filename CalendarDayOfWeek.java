package utsystem;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDayOfWeek {

	private static final int[] WEEK ={
				Calendar.SUNDAY,
				Calendar.MONDAY,
				Calendar.TUESDAY,
				Calendar.WEDNESDAY,
				Calendar.THURSDAY,
				Calendar.FRIDAY,
				Calendar.SATURDAY,};

	private static final String[] WEEK_JA = {"日","月","火","水","木","金","土",};

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		CalendarDayOfWeek ct = new CalendarDayOfWeek();
		System.out.print("年：");
		int y = stdln.nextInt();
		System.out.print("月：");
		int m = stdln.nextInt();
		int d = 1;
		int day = ct.getDayOfWeek(y, m, d);

		for(int i = 0; i < WEEK_JA.length; i ++){
			System.out.print(WEEK_JA[i] + " ");
		}

		int[][] hyo = new int[6][7];

		for(int i = day; i < 7; i++){
			if(i == 0){
				for(int j = 0; j < 7; j++){
					hyo[0][j] = day + j - 7;
					System.out.print(hyo[0][j]);
				}
			}else
				for(int j = 0; j < 7; j++){
					hyo[i][j] = hyo[i - 1][j] + 7;
				}
		}
	}

	public int getDayOfWeek(int y, int m ,int d){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m - 1);
		cal.set(Calendar.DAY_OF_MONTH,  d);
		int w =cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 0; i < CalendarDayOfWeek.WEEK.length; i++){
			if(w == CalendarDayOfWeek.WEEK[i]){
				return i;//CalendarDayOfWeek.WEEK_JA[i];
			}
		}
		return 0;
	}

}
