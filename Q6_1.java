package utsystem;

import java.util.GregorianCalendar;
import java.util.Random;

public class Q6_1 {

	public static void main(String[] args) {

		GregorianCalendar today = new GregorianCalendar();

		int yy = today.get(GregorianCalendar.YEAR);
		int mm = today.get(GregorianCalendar.MONTH);
		int dd = today.get(GregorianCalendar.DATE);
		System.out.printf("今日は %4d 年 %02d 月 %02d 日です。\n", yy, mm, dd);


		Random rand =new Random();
		int k = rand.nextInt(10);
		System.out.print("今日の運勢は");
		switch(k){
			case 0:					System.out.print("大吉");break;
			case 1: case 2: case 3:	System.out.print("吉");break;
			case 4: case 5: case 6:	System.out.print("吉中");break;
			case 7: case 8:			System.out.print("小吉");break;
			case 9:					System.out.print("凶");break;
		}
	}

}
