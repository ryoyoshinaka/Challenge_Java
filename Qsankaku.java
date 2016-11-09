package utsystem;

import java.util.Scanner;

public class Qsankaku {

	public static void skk(double a, double b, double c) {
		if(0 >= a || 0 >= b || 0 >= c || (a + b <= c || a + c <= b || b + c <= a)){
			System.out.println("三角形ではありません。");

		}else if(a == b && a == c){
			System.out.println("正三角形です。");

		}else if(a == b || a == c || b == c ){
			System.out.println("二等辺三角形です。");

		}else
			System.out.println("不等辺三角形です。");
	}


	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		double a = stdln.nextDouble();
		double b = stdln.nextDouble();
		double c = stdln.nextDouble();

		skk(a, b, c);
	}

}

