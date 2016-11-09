package utsystem;

import java.util.Scanner;

public class Q5_04 {

	public static void printSeason(int m){

		if(2 < m && m < 6){
			System.out.print
			("春");
		}else if(5 < m && m < 9){
			System.out.print("夏");
		}else if(8 < m && m < 12){
			System.out.print("秋");
		}else if(m == 12 || m < 3){
			System.out.print("冬");

		}
	}

	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		int month;

		do{

			System.out.print("何月ですか(1～12) :");
			month = stdln.nextInt();

		}while(month < 1 || month > 12);

		System.out.print("その月の季節は");
		printSeason(month);
		System.out.println("です。");

	}

}
